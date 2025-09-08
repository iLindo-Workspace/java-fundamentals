package Chapter1;

/**
 * @author Lindokuhle Makanda
 * This class demonstrates the use of different methods from String class
 */
public class ExploreStrings
{
    public static void main(String[] args)
    {
        String firstname = "Johnathan";
        String lastname = "Smith";
        String sentence = "Video provides a powerful way to help you prove your point.";

//        System.out.println(firstname + " has " + firstname.length() + " letters.");
//        System.out.println("'m' is found at positions (index): " + lastname.indexOf("m") + " from " + lastname);
//        System.out.println("Is smith = " + lastname + "? " + lastname.equals("smith"));
//        System.out.println("The third letter from " + firstname + " is: " + firstname.charAt(2));
//        System.out.println("The last position of 'n' from " + firstname + " is: " + firstname.lastIndexOf("h"));
        System.out.println("With space: " + sentence.length());
        System.out.println("Without space: " + sentence.replace(" ", "").length());


    }
}
