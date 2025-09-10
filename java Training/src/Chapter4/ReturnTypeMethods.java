package Chapter4;

import java.util.Scanner;

/**
 * @author Lindokuhle Makanda
 */
public class ReturnTypeMethods
{
    public static void main(String[] args)
    {
        System.out.println(getAdress());
        String name = getPen().next();
    }

    public static String getAdress()
    {

        return """
                7932 Antananarivo Street
                Cosmo City
                2188
                """;
    }

    public static int getSum()
    {
        int num1 = 5, num2 = 15, sum = num1 + num2;
        return  sum;
    }

    public static Scanner getPen()
    {
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    public static boolean isEven()
    {
        int num = 12;
        return num % 2 == 0;
    }
}
