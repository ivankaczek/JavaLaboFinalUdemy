package labofinal;

import java.util.*;

public class Acciones {

    int opcion;
    Scanner sc = new Scanner(System.in);
    boolean seguirAdelante = true;
    boolean catalogoInicializado = false;

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
        switch (opcion) {
            case 1:
                if(!catalogoInicializado){
                 System.out.println("Se ha inicializado con éxito el catálogo de películas");
                    System.out.println("ACA FALTA EL CODIGO PARA INICIALIZAR CATALOGO");
                 catalogoInicializado = true;
                break;   
                } 
                
            case 2:
            case 3:
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
