package compiler.syntax.nonTerminal;

public class CasoAlt extends NonTerminal{
    private String valueOfGuard;

    public CasoAlt (String valueOfGuard){
        this.valueOfGuard = valueOfGuard;
    }

    public String getValueOfGuard(){
        return this.valueOfGuard;
    }
}
