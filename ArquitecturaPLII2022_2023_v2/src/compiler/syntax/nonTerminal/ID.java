package compiler.syntax.nonTerminal;

public class Id extends NonTerminal {
    private String name;
    private boolean hasAssignmentValue;
    private int value;

    public Id() {
        super();
    }

    public Id(String name, boolean hasAssignmentValue, int value){
        this.name = name;
        this.hasAssignmentValue = hasAssignmentValue;
        this.value = value;
    }

    public String getName(){
        return this.name;
    }

    public boolean hasAssignmentValue(){
        return this.hasAssignmentValue;
    }

    public int getValue(){
        return this.value;
    }
}

