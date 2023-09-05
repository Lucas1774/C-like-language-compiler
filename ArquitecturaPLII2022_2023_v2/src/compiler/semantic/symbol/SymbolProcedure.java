package compiler.semantic.symbol;

import java.util.ArrayList;

import compiler.syntax.nonTerminal.Parametro;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolProcedure.
 */

// Student work
//       Include properties to characterize procedure calls

public class SymbolProcedure
    extends SymbolBase
{
    private ArrayList<Parametro> listOfParameters;
   
    /**
     * Constructor for SymbolProcedure.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolProcedure (ScopeIF scope, 
                            String name,
                            TypeIF type)
    {
        super (scope, name, type);
    } 

    public SymbolProcedure (ScopeIF scope, 
                            String name,
                            TypeIF type,
                            ArrayList<Parametro> listOfParameters)
    {
        super (scope, name, type);
        this.listOfParameters = listOfParameters;
    }

    public ArrayList<Parametro> getParameters(){
        return this.listOfParameters;
    }
}
