package Chapter3;
/**
 * @author Lindokuhle Makanda
 * - Use for loop when you know number of times the loop should execute
 */
public class ForLoop
{
    public static void main(String[] args)
    {
        //Display Java 5 times
        for(int i = 1; i <= 5; i++)
        {
            System.out.print(i + " - Java  ");

        }

        System.out.println("\n\nMULTIPLE CONDITIONS");
        //multiple conditions
        for(int x = 1, y = 5; x < 10 && y >= 0; x++, y--)
        {
            System.out.println(x + " <--------> " + y);
        }
    }
}
