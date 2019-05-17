package Listas;

public class PrincipalNodos {
    public static void main(final String[] args) {
        final ListaSimpleEnlazada lista = new ListaSimpleEnlazada();
        System.out.println("La lista esta vacia?: " + lista.vacia());

        lista.agregar("Panchito");
        lista.agregar("Jesus");
        lista.agregar("Roberto");
        lista.agregar("cosa");
        lista.agregar("color");
        lista.agregar("mar");
        lista.agregar(8);
        lista.agregar(8);
        lista.agregar(9);
        lista.agregar(85);
        lista.agregar("Andres");

        System.out.println("Ultima incercion: " + lista.obtener(0));
        System.out.println("Penultima incercion: " + lista.obtener(1));
        System.out.println("El valor de el ultimo Nodo es: " + lista.obtener(lista.getLongitud() - 1));

        System.out.println("Numero de Nodos: " + lista.getLongitud());
        System.out.println("La lista esta vacia?: " + lista.vacia());

        for (int i = 0; i < lista.getLongitud(); i++) {
            System.out.println(lista.obtener(i));
        }
        final Integer posicion = lista.buscar("Andres");
        System.out.println("La busqueda deseada esta en la posicion: " + posicion);
    }
}
