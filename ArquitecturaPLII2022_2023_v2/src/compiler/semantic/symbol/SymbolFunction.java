package compiler.semantic.symbol;

import java.util.ArrayList;

import compiler.syntax.nonTerminal.Parametro;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolFunction.
 */

// Student work
//       Include properties to characterize function calls

public class SymbolFunction
    extends SymbolProcedure
{
    ArrayList<Parametro> listOfParameters;
    /**
     * Constructor for SymbolFunction.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolFunction (ScopeIF scope, 
                            String name,
                            TypeIF type,
                            ArrayList<Parametro> listOfParameters)
    {
        super (scope, name, type);
        this.listOfParameters = listOfParameters;
    } 
}
