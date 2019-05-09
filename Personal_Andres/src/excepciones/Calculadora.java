package excepciones;

public enum Calculadora {

    SUMA("S"), RESTA("R"), MULTIPLICACION("M"), DIVISION("D");

    private final String inicialCalculadora;

    Calculadora(final String inicialCalculadora) {
        this.inicialCalculadora = inicialCalculadora;
    }

    public String getInnicialCalculadora() {
        return this.inicialCalculadora;
    }

}
