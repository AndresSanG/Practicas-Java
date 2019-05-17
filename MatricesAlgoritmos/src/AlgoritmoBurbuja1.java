
public class AlgoritmoBurbuja1 {
    public static void main(final String[] args) {

        final int numerosDesorden[] = { 9, 5, 8, 2, 6, 1, 7, 3, 4 };
        // final int numeros[] = new int[10];

        int i = 0;
        int numA = 0;
        final int numB = numA + 1;
        // final int imp = 0;
        int comparativa1 = 0;

        while (numB == numerosDesorden.length) {
            while (i < (numerosDesorden.length - 1)) {
                if (numerosDesorden[numA] < numerosDesorden[numB]) {
                    // si es menor dejalo pasar
                } else {
                    comparativa1 = numerosDesorden[numA];// si no es menor intercambialo
                    numerosDesorden[numA] = numerosDesorden[numB];
                    numerosDesorden[numB] = comparativa1;
                }
            }
            i = i + 1;
        }
        numA = numA + 1;
        for (int j = 0; j <= numerosDesorden.length; j++) {
            System.out.print("(" + numerosDesorden[j] + ")");
        }
    }
}