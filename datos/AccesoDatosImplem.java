package datos;

import dominio.Pelicula;

public class AccesoDatosImplem implements AccesoDatos {

    /*
    Esta clase CONTROLA las operaciones a ejectuar en el 
    ARCHIVO txt
    
    */
    
    
    @Override
    public boolean existe(String rutaArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void anexarPeliculaEnLista(Pelicula pelicula, String rutaArchivo, boolean anexar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String buscar(String rutaArchivo, String cualPeli) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearPeli(String rutaArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarPeli(String rutaArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
