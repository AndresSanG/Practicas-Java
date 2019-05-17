
public class BusquedaSecuencial {
    public static void main(final String[] args) {
        final int base[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Boolean encontrado = false;
        final int datoBuscado = 5;
        int i = 0;

        while (i <= 8) {
            if (datoBuscado == base[i]) {
                System.out.println("Se encontro el dato");
                encontrado = true;
            } else {
                i += i;
            }
            if (i == base.length) {
                System.out.println("No se encontro el dato");

            }
        }
    }
}
