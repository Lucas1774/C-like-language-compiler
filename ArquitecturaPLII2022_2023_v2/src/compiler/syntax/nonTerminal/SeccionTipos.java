package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class SeccionTipos extends NonTerminal {
    private ArrayList <DeclaracionTipo> list;
    
    public SeccionTipos() {
        super();
        this.list = new ArrayList<DeclaracionTipo>();
    }

    public ArrayList<DeclaracionTipo> getTipos() {
        return this.list;
    }
}

