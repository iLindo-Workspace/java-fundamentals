package Chapter1;
/**
 * Documentation Comments have two ** at the beginning after /
 * They're before methods , or classes, or at  class level
 * @author Lindokuhle Makanda
 * This class shows basic variable declaration
 *
 * */
public class GetStarted
{

    public static void main(String[] args)
    {
       //Declare
        //Data types
        int age = 21;
        short shortAge = 25;
        double height = 18.6;
        float salary = 1843.55f; //have to insert f at the end of floats, but only when you hard code values
        boolean isValid = true;
        char letter = 'M';

        //Object Type
        String firstName = "John";

        //Use
        System.out.println("First Name: " + firstName);
        System.out.println("Initials: " + letter);
        System.out.println("Height: " + height);
        System.out.println("Age: " + age);
        System.out.println("Short Age: " + shortAge);
        System.out.println("Salary: " + salary);










    }
}
