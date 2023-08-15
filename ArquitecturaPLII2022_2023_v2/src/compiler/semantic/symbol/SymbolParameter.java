package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolVariable.
 */

// Student work
//       Include properties to characterize parameters

public class SymbolParameter<T>
    extends SymbolBase
{  
    private T value;
    /**
     * Constructor for SymbolParameter.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolParameter (ScopeIF scope, String name, TypeIF type, T value)
    {
        super (scope, name, type);
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }
}
