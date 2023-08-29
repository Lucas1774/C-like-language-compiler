package compiler.code;

import java.util.Arrays;
import java.util.List;

import compiler.intermediate.Label;
import compiler.intermediate.Temporal;
import compiler.intermediate.Value;
import compiler.intermediate.Variable;
import compiler.semantic.type.TypeSimple;

import es.uned.lsi.compiler.code.ExecutionEnvironmentIF;
import es.uned.lsi.compiler.code.MemoryDescriptorIF;
import es.uned.lsi.compiler.code.RegisterDescriptorIF;
import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

/**
 * Class for the ENS2001 Execution environment.
 */

public class ExecutionEnvironmentEns2001 
    implements ExecutionEnvironmentIF
{    
    private final static int      MAX_ADDRESS = 65535; 
    private final static String[] REGISTERS   = {
       ".PC", ".SP", ".SR", ".IX", ".IY", ".A", 
       ".R0", ".R1", ".R2", ".R3", ".R4", 
       ".R5", ".R6", ".R7", ".R8", ".R9"
    };
    
    private RegisterDescriptorIF registerDescriptor;
    private MemoryDescriptorIF   memoryDescriptor;
    
    /**
     * Constructor for ENS2001Environment.
     */
    public ExecutionEnvironmentEns2001 ()
    {       
        super ();
    }
    
    /**
     * Returns the size of the type within the architecture.
     * @return the size of the type within the architecture.
     */
    @Override
    public final int getTypeSize (TypeSimple type)
    {      
        return 1;  
    }
    
    /**
     * Returns the registers.
     * @return the registers.
     */
    @Override
    public final List<String> getRegisters ()
    {
        return Arrays.asList (REGISTERS);
    }
    
    /**
     * Returns the memory size.
     * @return the memory size.
     */
    @Override
    public final int getMemorySize ()
    {
        return MAX_ADDRESS;
    }
           
    /**
     * Returns the registerDescriptor.
     * @return Returns the registerDescriptor.
     */
    @Override
    public final RegisterDescriptorIF getRegisterDescriptor ()
    {
        return registerDescriptor;
    }

    /**
     * Returns the memoryDescriptor.
     * @return Returns the memoryDescriptor.
     */
    @Override
    public final MemoryDescriptorIF getMemoryDescriptor ()
    {
        return memoryDescriptor;
    }

    /**
     * Translate a quadruple into a set of final code instructions. 
     * @param cuadruple The quadruple to be translated.
     * @return a quadruple into a set of final code instructions. 
     */
    @Override
    public final String translate (QuadrupleIF quadruple)
    {
        StringBuffer b = new StringBuffer();
        String operand1 = translateOperand(quadruple.getFirstOperand());
        String operand2 = translateOperand(quadruple.getSecondOperand());
        String result = translateOperand(quadruple.getResult());
        b.append(";" + quadruple.toString() + "\n"); // quadrupla en string para debug. ENS la ignora
        switch (quadruple.getOperation()){
            case "ADD":
                b.append("ADD " + operand1 + ", " + operand2 + "\n");
                b.append("MOVE " + ".A " + ", " + result);
                break;
            case "SUB":
                b.append("SUB " + operand1 + ", " + operand2 + "\n");
                b.append("MOVE " + ".A " + ", " + result);
                break;
            case "MUL":
                break;
            case "INC":
                break;
            case "NEG":
                break;
            case "EQ":
                break;
            case "LS":
                break;
            case "AND":
                break;
            case "NOT":
                break;
            case "BR":
                break;
            case "BRT":
                break;
            case "BRF":
                break;
            case "INL":
                break;
            case "MV":
                b.append("MOVE " + operand1 + ", " + result);
                break;
            case "MVA":
                b.append("MOVE #" + operand1.replace("/", "") + ", " + result);
                break;
            case "MVP":
                b.append("MOVE " + operand1 + ", " + result);
                break;
            case "STP":
                b.append("MOVE " + result + ", " + ".R1\n");
                b.append("MOVE " + operand1 + ", " + "[.R1]");
                break;
            case "HALT":
                b.append("HALT");
                break;
            case "WRITESTRING":
                b.append("WRSTR /" + operand1);
                break;
            case "WRITEINT":
                b.append("WRINT " + result);
                break;
            case "WRITEEMPTY":
                b.append("WRCHAR #10");
                break;
            case "CADENA":
                b.append(operand1 + ": DATA " + result);
                break;
            case "VARSTATIC":
                b.append("MOVE " + operand1 + ", " + result);
                break;
            default:
                break;
        }
        b.append("\n");
        return b.toString(); 
    }

    private boolean isStatic(Object operand) {
        return operand instanceof Variable ? ((Variable)operand).getScope().getLevel() == 0 || ((Variable)operand).getScope().getName().equals("main") :
        operand instanceof Temporal ? ((Temporal)operand).getScope().getLevel() == 0 || ((Temporal)operand).getScope().getName().equals("main") :
        false;
    }

    private String translateOperand (OperandIF operand) {
        if (operand instanceof Variable) {
            return isStatic((Variable)operand) ? "/" + ((Variable)operand).getAddress() :
            "#-" + ((Variable)operand).getAddress() + "[.IX]";
        } else if (operand instanceof Temporal){
            return isStatic ((Temporal)operand) ? "/" + ((Temporal)operand).getAddress() :
            "#-" + ((Temporal)operand).getAddress() + "[.IX]";
        } else if (operand instanceof Value){ 
            return "#" + ((Value)operand).getValue();
        } else if (operand instanceof Label){
            return ((Label)operand).getName();
        }
        return null;
    }
}
