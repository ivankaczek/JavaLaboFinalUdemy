package dominio;
public class Pelicula {

    private String nombre;

    // constructor vacio
    public Pelicula(){
    }

    // constructor con un argumento
    public Pelicula(String nombre){
        this.nombre = nombre;
    }

    // metodos get y set
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    
    // Método toString()
    
    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + '}';
    }
    
    /*
    Esta clase es un Java Bean porque cumple lo siguiente:
    atributos en private
    constructor vacio
    metodos get y set para cada atributo
    */
    
}
