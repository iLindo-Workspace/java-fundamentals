package Chapter1;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Lindokuhle Makanda
 * - This class demonstrates how to get input from the user
 * Using a Scanner class object
 */
public class GetInputScanner
{
    public static void main(String[] args)
    {
        //Locale.setDefault(Locale.US);
        int age;
        short shortAge;
        double height;
        float salary; //have to insert f at the end of floats, but only when you hard code values
        boolean isMarried = true;
        char initial;
        String firstName;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        firstName = sc.next();
        System.out.print("Enter your Age: ");
        age = sc.nextInt();
        System.out.print("Enter your height: ");
        height = sc.nextDouble();
        System.out.print("Enter your salary: ");
        salary = sc.nextFloat();
        System.out.print("Enter you initial: ");
        initial = sc.next().charAt(0);

        System.out.println("\n==========Details==========");
//        System.out.println("Name: " + firstName + " (" + initial + ")");
//        System.out.println("Age: " + age);
//        System.out.println("Height: " + height);
//        System.out.println("Salary: " + salary);
//        System.out.println("Married: " + "(" + isMarried + ")");

        System.out.println("Name: " + firstName + " (" + initial + ")" +
                          "\nAge: " + age +
                          "\nHeight: " + height +
                          "\nSalary: R" + salary +
                          "\nMarried?: " + "(" + isMarried + ")");

    }
}
