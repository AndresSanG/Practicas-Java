package excepciones;

import java.util.Scanner;

public class Principal {
    public static void main(final String args[]) {
        final int numerUno;
        final int numeroDos;
        String operacion;
        final Scanner entrada = new Scanner(System.in);
        // try {

        System.out.println("Vamos a hacer una operacion");
        System.out.println("Dame la operacion que vamos a hacer");
        System.out.println("Las opciones son:");
        System.out.print("Para sumar (S)");
        System.out.print("Para restar (R)");
        System.out.print("Para multiplicar (M)");
        System.out.println("Para dividir (D)");
        operacion = entrada.nextLine();
        // }
    }
}
// {
// switch(operacion){
// case S:
// System.out.println("El resultado de tu suma es: ");
// break;
// case R:
// System.out.println("El reultado de tu resa ta es: ");
// break;
// case M:
// System.out.println("El resultado de tu multiplicacion es: ");
// break;
// case D:
// System.out.println("El rsultado de tu division es: ");
// break;

//                default:
// System.out.println("¿Eh?");
// break;
// }

// }
// }catch() {
// }
// }
//}
