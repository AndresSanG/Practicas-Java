package Listas;

public class Nodo {
    public Object dato;
    public Nodo siguiente;

    public Nodo(final Object dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public void enlazar(final Nodo n) {
        this.siguiente = n;
    }

    public Nodo getSiguente() {
        return this.siguiente;
    }

    public Object getDato() {
        return this.dato;
    }
}
