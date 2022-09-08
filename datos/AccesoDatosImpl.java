package datos;

import dominio.Pelicula;
import excepciones.*;
import java.io.*;
import java.util.*;


public class AccesoDatosImpl implements IAccesoDatos {

    /*
    Esta clase CONTROLA las operaciones a ejectuar en el 
    ARCHIVO txt o en otro recurso, ejemplo una base de datos
     
     */
    @Override
    public List<Pelicula> listar(String rutaArchivo) throws LecturaDatosEx {
        var archivo = new File(rutaArchivo);
        List<Pelicula> listadoPelisDevolver = new ArrayList();
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                var peliParaAgregAlArray = new Pelicula(linea);
                listadoPelisDevolver.add(peliParaAgregAlArray);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Exepcion al listar peliculas " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al listar pelis");
        }
        return listadoPelisDevolver;
    }

    @Override
    public String buscarPeli(String rutaArchivo,
            String cualPeli) throws LecturaDatosEx {
        /*
        va a decir si existe la peli, y el índice donde la encontró
        */
        var archivo = new File(rutaArchivo);
        String resultado = null;
        try {
            var entrada = new BufferedReader(new FileReader(rutaArchivo));
            String lineaParaAlmacenar = null;
            lineaParaAlmacenar = entrada.readLine();
            var indice = 1;
            while(lineaParaAlmacenar!=null){
                if(cualPeli != null && cualPeli.equalsIgnoreCase(lineaParaAlmacenar)){
                    resultado = "Pelicula " + lineaParaAlmacenar + " encontrada en el índice " + indice;
                    
                }
                lineaParaAlmacenar = entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            throw new LecturaDatosEx("Excepción al buscar película: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            
        }
        
        return resultado;
    }

    @Override
    public void escribirPeliEnLista(String rutaArchivo, Pelicula peli, boolean anexar) throws EscrituraDatosEx {
        var archivo = new File(rutaArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(peli.toString());
            salida.close();
            System.out.println("se ha escrito informacion al archivo");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new EscrituraDatosEx("excepcion al escribir peliculas " + ex.getMessage());
        }
    }

    @Override
    public void crearRecurso(String nombreRecurso) throws AccesoDatosEx {
        var archivo = new File(nombreRecurso);
        try {
            var salida = new PrintWriter(new FileWriter(nombreRecurso));
            salida.close();
            System.out.println("se ha creado el archivo");
        } catch (IOException ex) {
                ex.printStackTrace(System.out);
                throw new AccesoDatosEx("excepción al crear archivo");
                
        }
        
    }

    @Override
    public boolean existe(String rutaArchivo) throws AccesoDatosEx {
        boolean elArchivoRecursoExiste = false;
        File archivoABuscar = new File(rutaArchivo);
        return archivoABuscar.exists();
    }

    @Override
    public void anexarPeliculaEnLista(Pelicula pelicula, String rutaArchivo, boolean anexar) {

    }

    @Override
    public void borrarPeli(String rutaArchivo) throws AccesoDatosEx {
        var archivo = new File(rutaArchivo);
        if(archivo.exists())
            archivo.delete();
        System.out.println("se ha borrado el archivo");
    }

}

/*
ATENCIÓN: Para entender esto al 100% sería clave comprender cómo funciona
            la clase BufferedReader, pero eso llevaría bastante tiempo
*/
