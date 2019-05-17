
public class Burbuja {
    public static void main(final String[] args) {

        final String coches1[] = new String[9];

        final String coches[] = new String[9];
        coches[0] = "Alfa Romeo";
        coches[1] = "Fiat";
        coches[2] = "Ford";
        coches[3] = "Lancia";
        coches[4] = "Renault";
        coches[5] = "Seat";

        int i = coches.length - 6;
        final int p = 4;
        while (i >= p) {
            coches[i + 1] = coches[i];
            i = i - 1;
        }
        coches[p] = "Opel";
        for (final String recorrer : coches) {
            System.out.println(recorrer);
        }
        for (int j = 0; j < coches.length; j++) {
            System.out.println(coches[j]);
        }
    }
}
