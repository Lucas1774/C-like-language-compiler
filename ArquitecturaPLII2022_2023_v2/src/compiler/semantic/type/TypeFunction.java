package compiler.semantic.type;

import es.uned.lsi.compiler.semantic.ScopeIF;

/**
 * Class for TypeFunction.
 */

// Student work
//       Include properties to characterize function declarations

public class TypeFunction
    extends TypeProcedure
{   
    
    /**
     * Constructor for TypeFunction.
     * @param scope The declaration scope.
     */
    public TypeFunction (ScopeIF scope)
    {
        super (scope);
    }

    /**
     * Constructor for TypeFunction.
     * @param scope The declaration scope
     * @param name The name of the function.
     */
    public TypeFunction (ScopeIF scope, String name)
    {
        super (scope, name);
    }
    
    /**
     * Returns the size of the type.
     * @return the size of the type.
     */
    @Override
    public int getSize ()
    {
        // Student work
        return 1;
    }
}
