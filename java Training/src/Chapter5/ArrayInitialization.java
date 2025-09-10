package Chapter5;

/**
 * @author Lindokuhle Makanda
 */
public class ArrayInitialization
{
    public static void main(String[] args)
    {
          int arrNumber[] = new int[]{52,41,32,74,85};
          String[] arrNames = new String[]{"Kate","Odwa","John","O.d","Lilo"};
          double[] arrPrices = new double[]{23.55,15.5,52.99,99.99,75.69};//Being explicit on creating the array, which allows to change the contents of the arrays
          double[] arrSales = {5000.00,2000.00,5000.00,5500.00, 6750.00};// this only works on declaration and the content cannot be changed


        //Re-assigning
//        arrPrices = new double[]{500,600};
//        arrSales = new double[]{5000,6000}; // This is the only way you can change content of the already declared array with "new" keyword

        System.out.println("=====================Numbers=====================");
        for (int i = 0; i < arrNumber.length ; i++) {
            System.out.print(arrNumber[i] + " ");
        }


        System.out.println("\n\n=====================Names=====================\n");
        int count = 0;
        while(count < arrNames.length)
        {
            System.out.print(arrNames[count] + " ");
            count++;
        }

        System.out.println("\n===========Prices=============");
        for (int i = 0; i < arrPrices.length; i++) {
            double price = arrPrices[i];
            System.out.println(price);
        }

        System.out.println("old price\tNew price");
        for (double price : arrPrices){
            price = price + (price * 0.1);//change each price
            System.out.println(price);
        }
    }
}
