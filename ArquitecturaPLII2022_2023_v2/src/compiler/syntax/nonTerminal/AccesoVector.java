package compiler.syntax.nonTerminal;

public class AccesoVector extends NonTerminal {
    String name;

    public AccesoVector (String name) {
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
