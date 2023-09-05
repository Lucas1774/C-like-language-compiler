package compiler.syntax.nonTerminal;

public class Sentencia extends NonTerminal {
    String type;

    public Sentencia() {
        super();
    }

    public Sentencia(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}

