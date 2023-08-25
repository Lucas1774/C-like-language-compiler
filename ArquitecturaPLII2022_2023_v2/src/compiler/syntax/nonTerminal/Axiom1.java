package compiler.syntax.nonTerminal;

import java.util.ArrayList;
public class Axiom1 extends NonTerminal {
    private ArrayList<DeclaracionVariable> listaDeclaracionesVariable;

    public Axiom1(ArrayList<DeclaracionVariable> listaDeclaracionesVariable) {
        this.listaDeclaracionesVariable = listaDeclaracionesVariable;
    }

    public ArrayList<DeclaracionVariable> getListaDeclaracionesVariable() {
        return this.listaDeclaracionesVariable;
    }
}
