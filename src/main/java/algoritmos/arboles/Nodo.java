package algoritmos.arboles;

/**
 * Nodo del Árbol
 */
public class Nodo {
    
    String dato;
    
    Nodo izquierda;
    Nodo derecha;

    public Nodo() {
    }
    
    public Nodo(String dato) {
        this.dato = dato;
    }
    
    public Nodo(String dato, Nodo izquierda, Nodo derecha){
        this.dato = dato;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
  
   
}
