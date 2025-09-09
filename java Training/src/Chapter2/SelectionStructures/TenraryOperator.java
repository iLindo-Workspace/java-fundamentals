package Chapter2.SelectionStructures;

/**
 * @author Lindokuhle Makanda
 *  - This class demonstrates the use of ternary operators
 */
public class TenraryOperator
{
    public static void main(String[] args)
    {
        //condition ? resultsWhenTrue : resultsWhenFalse
//
//        int num1 = 5, num2 = 7;
//        int smallNum;
//
//
//        if(num1 > num2){
//            smallNum = num1;
//        }else{
//            smallNum = num2;
//        }
//
//        smallNum = num1 > num2 ? num1 : num2;
//

        int number = 5;
        String results = "";

//        if(number % 2 == 0)
//        {
//            System.out.println("Even number");
//        }else if(number % 5 == 0){
//            System.out.println("Multiple of 5");
//        }else{
//            System.out.println("Odd number");
//        }

        results = number % 2 == 0 ? "Even Number" :
                  number % 5 == 0 ? "Multiple of 5" : "Odd Number";
        System.out.println(results);
    }
}
