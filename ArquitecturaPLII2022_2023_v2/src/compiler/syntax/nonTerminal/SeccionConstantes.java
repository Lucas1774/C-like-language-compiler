package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class SeccionConstantes extends NonTerminal {
    private ArrayList <DeclaracionConstante> list;

    public SeccionConstantes() {
        super();
        this.list = new ArrayList <DeclaracionConstante>();
    }

    public ArrayList <DeclaracionConstante> getConstantes() {
        return this.list;
    }
}

