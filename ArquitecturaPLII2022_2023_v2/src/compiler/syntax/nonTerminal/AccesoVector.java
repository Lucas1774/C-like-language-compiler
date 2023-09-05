package compiler.syntax.nonTerminal;

public class AccesoVector extends NonTerminal {
    String name;
    int index;

    public AccesoVector (String name,  int index) {
        this.name = name;
        this.index = index;
    }
    
    public String getName(){
        return name;
    }

    public int getValue(){
        return this.index;
    }
}
