package compiler.syntax.nonTerminal;

public class Id1 {
    private boolean hasAssignmentValue;
    private int value;

    public Id1() {
        super();
    }

    public Id1(boolean hasAssignmentValue, int value) {
        this.hasAssignmentValue = hasAssignmentValue;
        this.value = value;
    }
    
    public boolean hasAssignmentValue() {
        return this.hasAssignmentValue;
    }

    public int getValue() {
        return this.value;
    }
}
