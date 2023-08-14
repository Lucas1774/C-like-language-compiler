package compiler.syntax.nonTerminal;

public class TamTipo extends NonTerminal {
    private String value;

    public TamTipo(String value) {
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
}

