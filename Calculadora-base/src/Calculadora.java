public class Calculadora {

    long suma(final long numeroUno, final long numeroDos) {
        final long resultado = numeroUno + numeroDos;
        System.out.println("El resultado de la operación " + EnumCalculadora.SUMA + " es: " + resultado);
        return resultado;
    }

    long resta(final long numeroUno, final long numeroDos) {
        final long resultado = numeroUno - numeroDos;
        System.out.println("El resultado de la operación " + EnumCalculadora.RESTA + " es: " + resultado);
        return resultado;
    }

    long multiplicacion(final long numeroUno, final long numeroDos) {
        final long resultado = numeroUno * numeroDos;
        System.out.println("El resultado de la operación " + EnumCalculadora.MULTIPLICACION + " es: " + resultado);
        return resultado;

    }

    long division(final long numeroUno, final long numeroDos) {
        final long resultado = numeroUno / numeroDos;
        System.out.println("El resultado de la operación " + EnumCalculadora.DIVISION + " es: " + resultado);
        return resultado;
    }
}
