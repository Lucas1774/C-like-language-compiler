package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class Funcion extends NonTerminal{
    private ArrayList<Sentencia> sentencias;
    private ArrayList<Id> variables;

    public Funcion(ArrayList<Sentencia> sentencias, ArrayList<Id> variables) {
        this.sentencias = sentencias;
        this.variables = variables;
    }

    public ArrayList<Sentencia> getListaSentencias() {
        return this.sentencias;
    }

    public ArrayList<Id> getListaVariables() {
        return this.variables;
    }
}
