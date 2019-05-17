
public class BusquedaCentral {
    public static void main(final String[] args) {

        final int base[] = { 1, 3, 5, 7, 11, 13, 17, 23, 29, 31, 37, 41 };
        final int buscar = 23;
        int bajo = 0;
        int alto = base.length;
        int central = (bajo + alto) / 2;

        while ((bajo < alto) && (base[central] != buscar)) {
            if (buscar < base[central]) {
                alto = central - 1;
            } else {
                bajo = central + 1;
            }
            central = (bajo + alto) / 2;
        }
        if (buscar == base[central]) {
            System.out.println("Valor " + buscar + " encontrado en " + central);
        } else {
            System.out.println("Valor no encontrado");
        }
    }

}
