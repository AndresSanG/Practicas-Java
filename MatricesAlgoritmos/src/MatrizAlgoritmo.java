
public class MatrizAlgoritmo {
    public static void main(final String[] args) {
        String nombre;
        nombre = "Juan Pedro Ortega";
        System.out.println(nombre.substring(5, 10));
        System.out.println(nombre.substring(5, 6));
        System.out.println(nombre.charAt(5));
        System.out.println(nombre.length());

        final char caracter = nombre.charAt(5);
        final int valorCaracter = caracter;
        System.out.println("El Valor de P es " + valorCaracter);

        final String pedro = "pedro";
        final String jose = "jose";
        if (pedro.compareTo(jose) == 0) {
            System.out.println("Son Iguales");
        } else if (pedro.compareTo(jose) < 0) {
            System.out.println("Es mayor" + pedro + "que" + jose);
        } else if (pedro.compareTo(jose) > 0) {
            System.out.println("Es menor " + pedro + " que " + jose);
        }

        final int matriz[][] = new int[6][6];
        matriz[0][0] = 0;
        matriz[0][1] = 1;
        matriz[0][2] = 1;
        matriz[0][3] = 1;
        matriz[0][4] = 1;
        matriz[0][5] = 0;
        matriz[1][0] = 1;
        matriz[1][1] = 0;
        matriz[1][2] = 0;
        matriz[1][3] = 1;
        matriz[1][4] = 0;
        matriz[1][5] = 0;
        matriz[2][0] = 1;
        matriz[2][1] = 0;
        matriz[2][2] = 0;
        matriz[2][3] = 1;
        matriz[2][4] = 1;
        matriz[2][5] = 1;
        matriz[3][0] = 1;
        matriz[3][1] = 1;
        matriz[3][2] = 1;
        matriz[3][3] = 0;
        matriz[3][4] = 1;
        matriz[3][5] = 1;
        matriz[4][0] = 1;
        matriz[4][1] = 0;
        matriz[4][2] = 1;
        matriz[4][3] = 1;
        matriz[4][4] = 0;
        matriz[4][5] = 0;
        matriz[5][0] = 0;
        matriz[5][1] = 0;
        matriz[5][2] = 1;
        matriz[5][3] = 1;
        matriz[5][4] = 0;
        matriz[5][5] = 0;
        for (final int[] element : matriz) {
            for (final int element2 : element) {
                System.out.print("(" + element2 + ")");
            }
            System.out.println("");
        }

    }
}