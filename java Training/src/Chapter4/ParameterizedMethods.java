package Chapter4;

import java.util.Arrays;

/**
 * @author Lindokuhle Makanda
 */
public class ParameterizedMethods
{
    public static void main(String[] args)
    {

        displayMessage("Welcome to a Java Course");
        displayDetails("Odwa", 31, 1.67, 20000.00f);
        System.out.println("\nSum: " + getSum(10,30));
        System.out.println("\n Sum: " + calSum(2,5,6,7,8));

    }

    public static void displayMessage(String msg)
    {
        System.out.println(msg);
    }

    public static int getSum(int num1, int num2)
    {
        return num1 + num2;
    }

    public static double calSum(double... numbers)
    {
        return Arrays.stream(numbers).sum();
    }

    public static void displayDetails(String name, int age, double height, float salary)
    {
        System.out.println("\nname = " + name + ", age = " + age + ", height = " + height + ", salary = R" + salary);

    }


}
