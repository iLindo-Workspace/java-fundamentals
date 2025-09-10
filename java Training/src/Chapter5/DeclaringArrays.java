package Chapter5;

/**
 * @author Lindokhule Makanda
 * - This class shows how to declare, assign and use array elements
 */
public class DeclaringArrays
{
    public static void main(String[] args)
    {
        //Declare
        int[] arrNumbers = new int[5];
        String[] arrNames = new String[5];
        double[] arrPrices = new double[5];

        //Instantiate
//        arrNumbers = new int[5];
//        arrNames =
//        arrPrices = new Double[5];

        //Assign
        arrNumbers[0] = 1;
        arrNumbers[1] = 15;
        arrNumbers[2] = 52;
        arrNumbers[3] = 54;
        arrNumbers[4] = 65;

        System.out.println(arrNumbers[4]);
        System.out.println(arrNames[4]);
        System.out.println(arrPrices[2]);
    }
}
