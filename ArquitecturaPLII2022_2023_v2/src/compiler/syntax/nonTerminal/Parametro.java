package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Parametro extends NonTerminal {
    TypeIF type;
    String name;

    public Parametro(TypeIF type, String name){
        this.type = type;
        this.name = name;
    }

    public TypeIF getType(){
        return this.type;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return this.name + " " + this.type;
    }
}

