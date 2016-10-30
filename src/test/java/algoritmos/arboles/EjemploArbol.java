package algoritmos.arboles;

import static algoritmos.arboles.ArbolDsl.*;

/**
 * Ejemplo de las clases del árbol
 */
public class EjemploArbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Arbol arbol = new Arbol(
               new Nodo("11", 
                       new Nodo("4", 
                               null, 
                               new Nodo("9")), 
                       new Nodo("12"))
        );
       
       Arbol arbol2 = arbol(
                nodo ("11",
                        nodo ("4",
                              null,
                              nodo("9")),
                        nodo("12")
                )
               );
        
       arbol.recorrer();
        
       arbol2.recorrer();       

    }
    
}
