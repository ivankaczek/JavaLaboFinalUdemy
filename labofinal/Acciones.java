package labofinal;

import java.util.*;
import servicio.CatalogoPeliculasImplem;

public class Acciones {

    int opcion;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    boolean seguirAdelante = true;
    boolean catalogoInicializado = false;
    CatalogoPeliculasImplem cat = new CatalogoPeliculasImplem();
    String rutaArch = "D:\\UdemyJAVA\\CPJLaboFinal\\catalogoPelis.txt";

    public void ejecutarMenu() {
        
        
        do {
            ejecutarAccion(opcion);
        } while (seguirAdelante);

        // Cuando la opción sea '0' y termine el programa tendremos:
    }

    public void mostrarOpciones() {
        System.out.println("Elija una opción:");
        if(!catalogoInicializado){
         System.out.println("1. Iniciar catálogo de películas");   
        }
        
        System.out.println("2. Agregar una película al catálogo");
        System.out.println("3. Listar las películas en el catálogo");
        System.out.println("4. Buscar una película");
        System.out.println("0. Salir");
    }

    public int seleccionarOpcion(){
        mostrarOpciones();
        opcion = sc.nextInt(); 
        return opcion;
    }
    
    public void ejecutarAccion(int opcion) {
        opcion = seleccionarOpcion();
        System.out.println("");
        switch (opcion) {
            case 1:
                if(!catalogoInicializado){
                 cat.iniciarArchivo(rutaArch);
                 System.out.println("Se ha inicializado con éxito el catálogo de películas");
                 catalogoInicializado = true;
                break;   
                } 
                
            case 2:
                System.out.println("Escriba la película que desea agregar al catálogo");
                String peliParaAgregar = sc.next();
                cat.agregarPelicula(peliParaAgregar, rutaArch);
                // System.out.println("Se ha agregado la película '" + peliParaAgregar+ "' correctamente");
                break;
            case 3:
                cat.listarPeliculas(rutaArch);
                //System.out.println("");
                break;
            case 4:
            case 0:
                System.out.println("Gracias por utilizar el programa");
                System.out.println("Los esperamos pronto!");
                seguirAdelante = false;
                break;
            default:
                System.out.println("La opción elegida no es una opción válida");
                System.out.println("");

        }
    }

}
/*
En la consola de salida se espera esto:
************************
Elige opción:
1. Iniciar catálogo de películas
2. Agregar película
3. Listar películas
4. Buscar película
0. Salir

**********
*/
