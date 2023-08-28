package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class Funcion extends NonTerminal{

    private ArrayList<Sentencia> listaSentencias;
    
    public Funcion(ArrayList<Sentencia> listaSentencias){
        super();
        this.listaSentencias = listaSentencias;
    }

    public ArrayList<Sentencia> getListaSentencias() {
        return listaSentencias;
    }
}
