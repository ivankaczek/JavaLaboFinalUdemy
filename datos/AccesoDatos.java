package datos;

import dominio.Pelicula;
import java.awt.List;

public interface AccesoDatos {

public abstract boolean existe(String rutaArchivo);
//public abstract List<Pelicula> listar();
/*
no entiendo bien la funcion de arriba qué hace o qué devuelve
y por qué tiene ese parámetro de String
*/
public abstract void anexarPeliculaEnLista(Pelicula pelicula,
                                            String rutaArchivo,
                                            boolean anexar);
public abstract String buscar(String rutaArchivo, String cualPeli);
public abstract void crearPeli(String rutaArchivo);
public abstract void borrarPeli(String rutaArchivo);
 
    
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