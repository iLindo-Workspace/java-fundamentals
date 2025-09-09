package Chapter3;
/**
 * @author Lindokuhle Makanda
 * - Use Do-While loop will execute atleast once.
 */

public class DoWhileLoop
{
	public static void main(String[] args)
	{
        char option = 'a';

        do
        {
            System.out.println("Option = " + option);
            option++;
        }while(option != 'g');
    }
}
