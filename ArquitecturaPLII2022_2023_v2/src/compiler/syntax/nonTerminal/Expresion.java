package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Expresion<T> {
    private TypeIF type;
    private String subType;
    private T value;

    public Expresion (TypeIF type, String subType, T value){
        this.type = type;
        this.subType = subType;
        this.value = value;
    }

    public TypeIF getType(){
        return this.type;
    }

    public String getSubType(){
        return this.subType;
    }

    public T getValue(){
        return this.value;
    }
}
