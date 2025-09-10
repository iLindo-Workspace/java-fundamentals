package Chapter4;

import java.util.Arrays;

/**
 * @author Lindokuhle Makanda
 */

public class MethodOverloading
{
    public static void main(String[] args)
    {
        System.out.println("Sum: " + calcSum(15f,32.78f));
    }

    /**
     * Calculate the sum of two integers
     * @param x Number 1
     * @param y Number 2
     * @return Sum
     */
    public static int calcSum(int x, int y )
    {
        return x + y;
    }

    /**
     * Calculate the sum of two doubles
     * @param x Number 1
     * @param y Number 2
     * @return Sum
     */
    public static double calcSum(double x, double y){
        return x + y;
    }

    /**
     * Calculate the sum of two floats
     * @param x Number 1
     * @param y Number 2
     * @return Sum
     */
    public static float calcSum(float x, float y){
        return x + y;
    }
}
