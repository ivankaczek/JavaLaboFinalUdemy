package datos;

import dominio.Pelicula;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;
import excepciones.LecturaDatosEx;
import java.util.List;

public interface IAccesoDatos {

public abstract boolean existe(String rutaArchivo) throws AccesoDatosEx;
/*
entonces la idea acá era saber si ya existe el archivo en el disco duro
*/

public abstract List<Pelicula> listar(String rutaArchivo) throws LecturaDatosEx;

public abstract void anexarPeliculaEnLista(Pelicula pelicula,
                                            String rutaArchivo,
                                            boolean anexar);
public abstract String buscarPeli(String rutaArchivo, String cualPeli) throws LecturaDatosEx;
public abstract void escribirPeliEnLista(String rutaArchivo, Pelicula peli, boolean anexar) throws EscrituraDatosEx;
public abstract void borrarPeli(String rutaArchivo) throws AccesoDatosEx;

public abstract void crearRecurso(String nombreRecurso) throws AccesoDatosEx;
 
    
}

/*
Contiene las operaciones a ejecutar en el archivo peliculas.txt

Sólo realizará las tareas más técnicas de manejo de archivos

La magia de las implementaciones es que por ejemplo, podriamos tener
una implementacion que guarde la info en un archivo y otra que la guarde
en una base de datos, pero la interfaz define una única acción,
que es el hecho de que en algún lado hay que guardar la info de la
película
*/