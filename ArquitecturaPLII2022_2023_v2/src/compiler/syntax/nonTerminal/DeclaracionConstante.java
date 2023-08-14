package compiler.syntax.nonTerminal;

public class DeclaracionConstante extends NonTerminal {
    private String name;
    private int value;
    private int line;

    public DeclaracionConstante() {
        super();
        this.name = "";
        this.value = 0;
    }

    public DeclaracionConstante(String name, int value, int line) {
        this();
        this.name = name;
        this.value = value;
        this.line = line;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }

    public int getLine(){
        return this.line;
    }
}

