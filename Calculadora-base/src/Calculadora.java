public class Calculadora {
    interface EnumCalculadora();

    PrincipalCalculadora operacionElegida;

    void SUMA ( final long numeroUno,final long numeroDos){
        resultado = numeroUno + numeroDos;
        System.out.println("El resultado de la operación " + operacionElegida.SUMA + " es: " + resultado);
        return;
        }resultado=numeroUno+numeroDos;System.out.println("El resultado de la operación "+operacionElegida.SUMA+" es: "+resultado);

        case RESTA:resultado=numeroUno-numeroDos;System.out.println("El resultado de la operación "+operacionElegida.RESTA+" es: "+resultado);break;case MULTIPLICACION:resultado=numeroUno*numeroDos;System.out.println("El resultado de la operación "+operacionElegida.MULTIPLICACION+" es: "+resultado);break;case DIVISION:resultado=numeroUno/numeroDos;System.out.println("El resultado de la operación "+operacionElegida.DIVISION+" es: "+resultado);break;default:System.out.println("Error en la operación bye!!");break;

    }

}
