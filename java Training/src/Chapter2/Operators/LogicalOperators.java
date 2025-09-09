package Chapter2.Operators;

/**
 * @author Lindokuhle Makanda
 * - Explore logical operators
 */
public class LogicalOperators
{
    public static void main(String[] args)
    {
        int a = 3, b = 5, c =10, d = 12;
        boolean e = false, f = true;

        boolean results = !e;//true

        results = e && f;//false
        results = e || f;// true

        results = a > 0 && e && d <= 5;

        System.out.println( a > 0 && e && d <= 5);//false
        System.out.println( (f || b == a) || (c > a));//true
        System.out.println( !(a >= 5) && (c > (d / 2)));//true

    }
}
