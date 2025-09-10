package Chapter4;

/**
 * @author Lindokuhle Makanda
 *
 */
public class VoidMethods
{
    public static void main(String[] args)
    {
        displayMessage();
        displayAddress();
    }

    public static void displayMessage()
    {
        System.out.println("Hello World");
    }

    public static void displayAddress(){
        System.out.println("""
                            
                            7932 Antananarivo Street
                            Cosmo City
                            2188 """);
    }
}
