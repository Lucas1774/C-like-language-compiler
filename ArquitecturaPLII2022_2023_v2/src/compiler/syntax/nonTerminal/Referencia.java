package compiler.syntax.nonTerminal;


public class Referencia extends NonTerminal{
    String name;
    String type;
    int index;

    public Referencia(String name, String type, int index) {
        this.name = name;
        this.type = type;
        this.index = index;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getIndex() {
        return this.index;
    }
}
