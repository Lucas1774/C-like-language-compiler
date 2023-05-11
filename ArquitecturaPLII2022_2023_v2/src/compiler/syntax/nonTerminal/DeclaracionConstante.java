package compiler.syntax.nonTerminal;

public class DeclaracionConstante extends NonTerminal {
    private String identificador;
    private int numero;

    public DeclaracionConstante() {
        super();
        this.identificador = "";
        this.numero = 0;
    }

    public DeclaracionConstante(String identificador, int numero) {
        this();
        this.identificador = identificador;
        this.numero = numero;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public int getNumero() {
        return this.numero;
    }
}

