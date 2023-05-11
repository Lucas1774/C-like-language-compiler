package compiler.syntax.nonTerminal;

public class DeclaracionTipo extends NonTerminal {
    private String identificador;
    private String cantidad;

    public DeclaracionTipo() {
        super();
        this.identificador = "";
        this.cantidad = "";
    }

    public DeclaracionTipo(String identificador, String cantidad) {
        this();
        this.identificador = identificador;
        this.cantidad = cantidad;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public String getCantidad() {
        return this.cantidad;
    }
}

