package algoritmos.arboles;

/**
 * DSL para crear un �rbol
 */
public class ArbolDsl {
    
	/**
	 * crea un �rbol
	 * @param raiz nodo ra�z del �rbol
	 * @return retorna un nuevo �rbol con el nodo suministrado
	 */
    public static Arbol arbol(Nodo raiz) {
        return new Arbol(raiz);
    }
    
    /**
     * crea un nodo del �rbol
     * @param dato valor a colocar en el nodo del �rbol
     * @return retorna un nuevo nodo del �rbol
     */
    public static Nodo nodo(String dato) {
        return new Nodo(dato);
    }

    /**
     * crea un nodo del �rbol
     * @param dato valor a colocar en el nodo del �rbol
     * @param izq nodo que debe ir a la izquierda
     * @param der nodo que debe ir a la derecha
     * @return retorna un nuevo nodo del �rbol
     */
    public static Nodo nodo(String dato, Nodo izq, Nodo der) {
        return new Nodo(dato, izq, der);
    }
    
}
