package Chapter1;

/**
 * @author Lindokuhle Makanda
 * This class shows different escape characters
 * '\n' - newLine
 * '\t' - tab
 * '\b' - backspace
 */
public class EscapeCharacters
{
    public static void main(String[] args)
    {
        int age = 21;
        double height = 18.6;
        String firstName = "John";
        System.out.print("Welcome To \"Java\"\b Training\n");
        System.out.println("Name\tAge\tHeight");
        System.out.println("-----------------------------");
        System.out.println(firstName +"\t" + age +"\t" + height);
        System.out.println("Sizwe\t23\t1.50");

    }
}
