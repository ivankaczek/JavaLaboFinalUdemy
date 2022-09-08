package servicio;

import datos.AccesoDatosImpl;
import datos.IAccesoDatos;
import dominio.Pelicula;
import excepciones.AccesoDatosEx;
import excepciones.LecturaDatosEx;



public class CatalogoPeliculasImplem implements ICatalogoPeliculas {
    
    /*
    Aquí la idea es decir 'voy a utilizar la interface'
    y más abajo decir, 'de todas las opciones, voy a implementar esta'
    NIVEL CAPA DE SERVICIO o LOGICA DE NEGOCIOS
    */
    private final IAccesoDatos datos;
    
    public CatalogoPeliculasImplem(){
        this.datos = new AccesoDatosImpl();
    }
    @Override
    public void agregarPelicula(String nombrePelicula) {
       Pelicula peliParaAgregar = new Pelicula(nombrePelicula);
       boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            /*
            lo interesante es que aquí estamos trabajando a nivel de 'negocio'
            o sea, a nivel aplicacion
            */
            datos.escribirPeliEnLista(NOMBRE_RECURSO, peliParaAgregar, anexar);
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace(System.out);
            System.out.println("Error de acceso a datos");
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var arrayPelis = this.datos.listar(NOMBRE_RECURSO);
            for (Pelicula pelicula : arrayPelis) {
                System.out.println("film: = " + pelicula);
            }
        } catch (LecturaDatosEx ex) {
            ex.printStackTrace(System.out);
            System.out.println("Error en acceso a datos ");
        }
        
    }

    @Override
    public void buscarPelicula(String peliculaParaBuscar) {
        String resultadoBusqueda = null;
        try {
            resultadoBusqueda = this.datos.buscarPeli(NOMBRE_RECURSO, peliculaParaBuscar);
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace(System.out);
            System.out.println("Error acceso datos en metodo buscar pelicula");
        }
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if(this.datos.existe(NOMBRE_RECURSO)){
                datos.borrarPeli(NOMBRE_RECURSO);
                datos.crearRecurso(NOMBRE_RECURSO);
            } else {
                datos.crearRecurso(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar catalogo de películas");
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
