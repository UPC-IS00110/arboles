package algoritmos.arboles;

/**
 * Arbol
 */
public class Arbol {

    Nodo raiz;

    public Arbol() {
    }

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    /**
     * Recorre el árbol en inorden, imprimiendo el valor en la consola
     */
    public void recorrer() {
        recorrer(raiz);
    }
    
    /**
     * Método recursivo que muestra el contenido del árbol.
     * @param nodo nodo (y sub-árbol) a mostrar en la consola
     */
    private void recorrer(Nodo nodo) {
        if (nodo.getIzquierda() != null)
            recorrer(nodo.getIzquierda());
        System.out.println(nodo.getDato());
        if (nodo.getDerecha() != null)
            recorrer(nodo.getDerecha());
    }
}
