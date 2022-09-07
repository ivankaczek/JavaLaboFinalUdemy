package labofinal;

import java.util.*;
import negocio.CatalogoPeliculas;

public class CursoProgJavaLaboFinal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        String rutaArchivo = "D:\\UdemyJAVA\\CPJLaboFinal\\";
        //CatalogoPeliculas cat = new CatalogoPeliculas();
        
        Acciones ac = new Acciones();
        
        ac.ejecutarMenu();
        
        
        
    }

    
}

/*
Contiene el menú que permite al usuario seleccionar
la acción a ejecutar sobre el catálogo de películas,
ya sea 
iniciar catálogo de películas
agregar una película
listar películas
buscar una película
salir

ATENCIÓN: La carpeta donde vayamos a trabajar ya debe estar creada

*/

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
2
Introduce el nombre de una película a agregar:
batman
Se ha escrito correctamente en el archivo
*/