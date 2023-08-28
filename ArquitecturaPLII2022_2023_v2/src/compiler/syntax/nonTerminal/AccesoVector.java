package compiler.syntax.nonTerminal;

public class AccesoVector extends NonTerminal {
    String name;
    int value;

    public AccesoVector (String name,  int value) {
        this.name = name;
        this.value = value;
    }
    
    public String getName(){
        return name;
    }

    public int getValue(){
        return this.value;
    }
}
