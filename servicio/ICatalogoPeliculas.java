package servicio;

import dominio.Pelicula;
import java.util.*;

public interface ICatalogoPeliculas {
    
    String NOMBRE_RECURSO = "D:\\UdemyJAVA\\CPJLaboFinal\\catalogoPelis.txt";

    public abstract void agregarPelicula(String nombrePelicula);
    
    public abstract void listarPeliculas();
    
    public abstract void buscarPelicula(String peliculaParaBuscar);
    
    public abstract void iniciarCatalogoPeliculas();
    
    /*
    La idea aquí es que es una capa extra, por arriba de la anterior
    de AccesoDatos, que es más amigable para el usuario, el cual
    no necesita saber la ruta sino solamente poner el nombre a ingrear
    o a buscar 
    */

    
}


/*
En Java una interface es una declaración formal de un contrato, en la cual los métodos no contienen
ninguna implementación, muy similar a los métodos abstractos que comentamos anteriormente.
Los atributos declarados en una interface son por default públicos, estáticos y finales, es decir son
constantes que podremos acceder simplemente poniendo el nombre de la interface, y
posteriormente el nombre de la constante, por ello si definimos atributos en una interface los
escribiremos con letras mayúsculas, y si contiene varias palabras las separaremos por un guion bajo,
por ejemplo: MI_CONSTANTE.

Los METODOS declarados en una interface por default son 
    públicos, abstractos, y no contienen ninguna implementación 
    (terminan con punto y coma), esto es similar a los métodos 
    abstractos de una clase abstracta.
Similar a la herencia en clases, una interface puede heredar de otra interface, pero no de una clase
concreta. Entonces una interface que hereda de otra interface agregará a sus definición de métodos
tanto los de la interface padre, como los métodos que esta interface defina.
Una interface sigue las mismas nomenclaturas de nombres que una clase, así que encontraremos
varias similitudes entre la definición de una clase y una interface.
Muchas clases pueden implementar la misma interface. Una clase puede implementar muchas
interfaces aunque no tengan ninguna relación. Como en una clase abstracta, no podemos crear
objetos de una interface, pero sí podemos crear variables de tipo Interface que apunten a objetos que
implementaron dicha Interface, de esta manera también aplicar conceptos de tipo polimorfismo
según hemos estudiado anteriormente.

Una clase abstracta se utiliza para encapsular funcionalidad común entre las
clases (características). Para hacer uso de una clase abstracta debemos
extender la clase.
En cambio, una interface define comportamiento relacionado que puede
pertenecer a cualquier clase o estructura. Para hacer uso de una interface
debemos implementar la interface.
Por lo que la recomendación es que las clases abstractas deben utilizarse
principalmente para objetos estrechamente relacionados, mientras que las
interfaces son más adecuadas para proporcionar funcionalidad común a clases
no relacionadas entre si.
Vamos a crear a continuación un ejemplo del uso de interfaces.



*/