package Listas;

public class ListaSimpleEnlazada {

    private Nodo cabecera;
    private int longitud;

    public ListaSimpleEnlazada() {
        this.cabecera = null;
        this.longitud = 0;
    }

    public void agregar(final Object o) {
        if (this.cabecera == null) {
            this.cabecera = new Nodo(o);
        } else {
            final Nodo temp = this.cabecera;
            final Nodo nuevo = new Nodo(o);
            nuevo.enlazar(temp);
            this.cabecera = nuevo;
        }
        this.longitud++;
    }

    public boolean vacia() {
        if (this.cabecera == null) {
            return true;
        } else {
            return false;
        }
        // return cabecera == null ? true : false;
    }

    public Object obtener(final int indice) {
        final Nodo nodo = this.obtenerNodo(indice);
        if (nodo != null) {
            return nodo.getDato();
        }
        return null;
    }

    public int getLongitud() {
        return this.longitud;
    }

    public Integer buscar(final Object o) {
        for (int i = 0; i < this.longitud; i++) {
            if (this.obtener(i).equals(o)) {
                return i;
            }
        }
        return null;
    }

    public boolean eliminar(final int indice) {
        boolean eliminado = false;
        Nodo nodoAnterior;
        Nodo nodoAEliminar;
        Nodo nodoSiguiente;
        try {
            nodoAEliminar = this.obtenerNodo(indice);
            nodoSiguiente = nodoAEliminar.getSiguente();
            if (indice == 0) {
                nodoAEliminar.enlazar(null);
                nodoAEliminar = null;
                this.cabecera = nodoSiguiente;
                eliminado = true;
                this.longitud--;
                return eliminado;
            }

            nodoAnterior = this.obtenerNodo(indice - 1);
            if (indice == (this.longitud - 1)) {
                nodoAnterior.enlazar(null);
                nodoAEliminar = null;
                eliminado = true;
                this.longitud--;
                return eliminado;
            }

            nodoAnterior.enlazar(nodoSiguiente);
            nodoAEliminar = null;
            eliminado = true;
            this.longitud--;
        } catch (final NullPointerException e) {
            eliminado = false;
        } catch (final ArrayIndexOutOfBoundsException e) {
            eliminado = false;
        }

        return eliminado;
    }

    private Nodo obtenerNodo(final int indice) {
        if ((this.longitud != 0) && (indice < this.longitud)) {
            Nodo temp = this.cabecera;
            for (int i = 0; i < indice; i++) {
                temp = temp.getSiguente();
            }
            return temp;
        } else {
            throw new ArrayIndexOutOfBoundsException("Excedio el limite del la lista");
        }
    }
}