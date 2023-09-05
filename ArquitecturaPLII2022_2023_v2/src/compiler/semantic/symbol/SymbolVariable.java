package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolConstant.
 */

// Student work
//       Include properties to characterize constants

public class SymbolVariable
    extends SymbolBase
{
    private int address;
    /**
     * Constructor for SymbolConstant.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolVariable (ScopeIF scope, String name, TypeIF type)
    {
        super (scope, name, type);
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getAddress() {
        return address;
    }

}
