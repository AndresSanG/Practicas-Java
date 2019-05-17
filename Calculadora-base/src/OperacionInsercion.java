import java.util.InputMismatchException;
import java.util.Scanner;

public class OperacionInsercion {

    Scanner entrada = new Scanner(System.in);
    long numeroUno;
    long numeroDos;
    Boolean checkUno = false;

    public long insercionUno() {
        do {
            try {

                System.out.println("Inserte el primer núermo");
                this.numeroUno = this.entrada.nextLong();
                this.checkUno = false;
            } catch (final InputMismatchException e) {
                System.out.println("Inserte un número válido");
                this.checkUno = true;
            }

        } while (this.checkUno);
        return this.numeroUno;
    }

    public long insercionDos() {
        do {
            try {
                this.entrada = new Scanner(System.in);
                System.out.println("Inserte el segundo núermo");
                this.numeroDos = this.entrada.nextLong();
                this.checkUno = false;
            } catch (final InputMismatchException e) {
                System.out.println("Inserte un número váido");
                this.checkUno = true;
            }
        } while (this.checkUno);

        return this.numeroDos;
    }
}
