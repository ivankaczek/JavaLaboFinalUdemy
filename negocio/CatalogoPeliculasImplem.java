package negocio;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
io stands for 'input-ouput'
 */
public class CatalogoPeliculasImplem implements CatalogoPeliculas {

    // Constructor vacio
    public CatalogoPeliculasImplem() {

    }

    // Implementacion de los metodos
    @Override
    public void agregarPelicula(String nombrePelicula, String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        try {

            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(nombrePelicula);
            salida.close();
            System.out.println("Se ha agregado la película '" + nombrePelicula + "' correctamente en el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

    @Override
    public void listarPeliculas(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lineaCompleta = entrada.readLine();
            while(lineaCompleta!= null){
                System.out.println("Titulo: " + lineaCompleta);
                lineaCompleta = entrada.readLine();
                }
                entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } finally {
            System.out.println("");
        }
        
    }

    @Override
    public void buscarPelicula(String rutaArchivo, String peliculaParaBuscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void iniciarArchivo(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        try {

            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo en el disco duro");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }

    }

}

/*
La implementación del catálogo de películas será quien use la interface
AccesoDatos.java 

La magia aquí es que la implementación utiliza la interface,
entonces en cualquier momento podríamos cambiar la implementacion
afectando lo menos posible el código que hemos programado

'Bajo acoplamiento' es el concepto 

*/
