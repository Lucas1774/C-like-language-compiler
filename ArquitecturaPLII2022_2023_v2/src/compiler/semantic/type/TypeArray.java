package compiler.semantic.type;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;

/**
 * Class for TypeArray.
 */

// Student work
//       Include properties to characterize array type

public class TypeArray
    extends TypeBase
{   
    private int length;
	/**
     * Constructor for TypeArray.
     * @param scope The declaration scope.
     */
    public TypeArray (ScopeIF scope)
    {
        super (scope);
    }

    public TypeArray (ScopeIF scope, String name, int length)
    {
        super (scope, name);
        this.length = length;
    }

    public int getLength(){
        return this.length;
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
