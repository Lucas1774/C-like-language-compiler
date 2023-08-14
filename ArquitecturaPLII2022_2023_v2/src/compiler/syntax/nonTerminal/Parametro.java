package compiler.syntax.nonTerminal;

public class Parametro extends NonTerminal {
    String type;
    String name;

    public Parametro() {
        super();
    }

    public Parametro(String type, String name){
        this.type = type;
        this.name = name;
    }

    public String getType(){
        return this.type;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return this.name + " tipo " + this.type;
    }
}

