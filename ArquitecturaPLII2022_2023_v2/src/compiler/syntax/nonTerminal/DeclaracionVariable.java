package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class DeclaracionVariable extends NonTerminal {
    private String tipo;
    private ArrayList<Id> list;

    public DeclaracionVariable(String tipo, ArrayList<Id> list) {
        this.tipo = tipo;
        this.list = list;
    }

    public String getTipo() {
        return tipo;
    }

    public ArrayList<Id> getList() {
        return list;
    }
}
