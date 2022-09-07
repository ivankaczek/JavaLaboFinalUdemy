package negocio;
public class CatalogoPeliculasImplem implements CatalogoPeliculas{

    // Constructor vacio
    public CatalogoPeliculasImplem(){
        
    }
    
    // Implementacion de los metodos
    @Override
    public void agregarPelicula(String nombrePelicula, String rutaArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarPeliculas(String rutaArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarPelicula(String rutaArchivo, String peliculaParaBuscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void iniciarArchivo(String rutaArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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