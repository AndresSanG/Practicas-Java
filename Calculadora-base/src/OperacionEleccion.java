import java.util.InputMismatchException;

public class OperacionEleccion {
    Boolean validarOper = false;
    EnumCalculadora operacionElegida = null;
    String operacion = null;

    public EnumCalculadora eleccion() {
        do {
            try {

                this.operacionElegida = EnumCalculadora.valueOf(this.operacion.toUpperCase());

                this.validarOper = false;
            } catch (final InputMismatchException e) {
                System.out.println("Operación invalida, vuelva a intentar");
                this.validarOper = true;
            } catch (IllegalArgumentException | NullPointerException ex) {
                System.out.println("Operación invalida, se cierra");
                this.validarOper = true;
            }
        } while (this.validarOper);
        return this.operacionElegida;
    }

}
