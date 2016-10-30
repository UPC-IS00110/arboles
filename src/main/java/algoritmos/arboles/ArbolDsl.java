package algoritmos.arboles;

/**
 * DSL para crear un árbol
 */
public class ArbolDsl {
    
	/**
	 * crea un árbol
	 * @param raiz nodo raíz del árbol
	 * @return retorna un nuevo árbol con el nodo suministrado
	 */
    public static Arbol arbol(Nodo raiz) {
        return new Arbol(raiz);
    }
    
    /**
     * crea un nodo del árbol
     * @param dato valor a colocar en el nodo del árbol
     * @return retorna un nuevo nodo del árbol
     */
    public static Nodo nodo(String dato) {
        return new Nodo(dato);
    }

    /**
     * crea un nodo del árbol
     * @param dato valor a colocar en el nodo del árbol
     * @param izq nodo que debe ir a la izquierda
     * @param der nodo que debe ir a la derecha
     * @return retorna un nuevo nodo del árbol
     */
    public static Nodo nodo(String dato, Nodo izq, Nodo der) {
        return new Nodo(dato, izq, der);
    }
    
}
