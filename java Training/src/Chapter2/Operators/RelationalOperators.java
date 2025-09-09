package Chapter2.Operators;

/**
 * @author Lindokuhle Makanda
 * - This class demonstrates how to use different relational operators
 * Explore relationships between operands
 */
public class RelationalOperators
{
    public static void main(String[] args)
    {
        double operand1 = 7;
        double operand2 = 12;


        System.out.println("1 - " + (operand1 == operand2));
        System.out.println("2 - " + (operand1 != operand2));
        System.out.println("3 - " + (operand1 > operand2));
        System.out.println("4 - " + (operand1 < operand2));
        System.out.println("5 - " + (operand1 >= operand2));
        System.out.println("6 - " + (operand1 <= operand2));
    }
}
