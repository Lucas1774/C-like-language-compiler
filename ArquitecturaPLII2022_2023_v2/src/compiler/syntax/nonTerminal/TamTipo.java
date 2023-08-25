package compiler.syntax.nonTerminal;

public class TamTipo<T> extends NonTerminal {
    private T value;

    public TamTipo(T value) {
        this.value = value;
    }
    
    public T getValue(){
        return this.value;
    }
}

