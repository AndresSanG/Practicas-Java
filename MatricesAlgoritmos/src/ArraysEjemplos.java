public class ArraysEjemplos {
    public static void main(final String[] args) {

        final int array[] = new int[6];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        float x = 0;
        for (final int claro : array) {
            System.out.println();
            x += claro;
        }
        System.out.println("La media de los valores de la tabla es:" + (x / 6));
    }
}
