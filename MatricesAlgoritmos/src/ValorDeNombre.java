
public class ValorDeNombre {
    public static void main(final String[] args) {
        final String nombre = "JESUS ANDRES SANTIAGO GARCIA";

        final char[] arregloNombre = nombre.toCharArray();
        // char caracter;
        final int valorLetra;

        int valorNombre = 0;

        for (final char caracter : arregloNombre) {
            valorNombre = valorNombre + caracter;
        }
        System.out.println("El valor del nombre: " + nombre + " es de " + valorNombre);

        valorNombre = 0;
        final char[] arregloNombre1 = nombre.toLowerCase().toCharArray();
        for (final char caracter : arregloNombre1) {
            valorNombre = valorNombre + caracter;
        }
        System.out.println("El valor del nombre: " + nombre.toLowerCase() + " es de " + valorNombre);

    }
}