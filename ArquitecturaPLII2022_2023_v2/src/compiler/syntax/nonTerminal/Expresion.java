package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Expresion<T> extends NonTerminal {
    private TypeIF type;
    private String subType;
    private T value;
    private int index;

    public Expresion (TypeIF type, String subType, T value){
        this.type = type;
        this.subType = subType;
        this.value = value;
    }

    public void setIndex(int index){
        this.index = index;
    }

    public int getIndex(){
        return this.index;
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
