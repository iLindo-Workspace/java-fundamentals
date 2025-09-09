package Chapter2.Operators;

/**
 * @author Lindokuhle Makanda
 * - This class demonstrates how to use different operators
 */
public class Assignment
{
    public static void main(String[] args)
    {
        //Assignment operator
        int age = 25;

        //Add, multiply, subtract, divide and Assign
        int a = 2, b = 5, c = 8, d = 6 ,e = 15;
        a+=3;
        b*=2;
        c-=3;
        d/=2;
        e%=3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

    }
}
