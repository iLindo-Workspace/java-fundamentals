package Chapter5.Exercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Lindokuhlwe Makanda
 *
 */
public class DistanceFromAverage
{
    public static void main(String[] args)
    {
        int[] arrUserNumbers = new int[10];
        greetings();

        //initializing the array
        arrUserNumbers = getArrayNumbers();

        double arrAverage = Arrays.stream(arrUserNumbers).average().getAsDouble();

        System.out.println(
                            String.format("""
                            
                            Average of the numbers you provided is: \t %.2f
                            """,arrAverage));


        //Printing the numbers
        for(int num : arrUserNumbers){

            if(num - arrAverage < 0){
                System.out.println(
                        String.format("""
                                        %d is below average by %.0f""",num,Math.abs(num - arrAverage)));
            }else{
                System.out.println(
                        String.format("""
                                        %d is above average by %.0f""",num,Math.abs(num - arrAverage)));
            }

        }

    }

    //Welcome message
    public static void greetings(){
        System.out.println("""
                Welcome...
                You're about to provide numbers and the program
                will give you the distance of each number from the
                average off all numbers
                """);
    }

    //Getting User numbers
    public static int[] getArrayNumbers()
    {
        int[] arrUserNumbers = new int[10];
        String number = "";
        int count = 0;

        System.out.println("""
                            You're about to be prompted to enter 10 numbers...
                            Providing 0 for the first prompt will stop the application
                            """);
        while(count < 10)
        {
            number = promptFormat(count);
            //Checking if it is 0 or contains letters
            if(number.equals("0") && count == 0){
                System.err.println("""
                                    You provided 0 which STOPS the application on the FIRST prompt.
                                    """);
                System.out.println("\n\nBYE!!!");
                System.exit(0);
            }else if(!number.matches("\\d+")){
                System.out.println("Please enter digits only");
                continue;
            }


            arrUserNumbers[count] = Integer.parseInt(number);
            count++;

        }

        return arrUserNumbers;

    }
    public static String promptFormat(int count)
    {
        Scanner input = new Scanner(System.in);
        if(count + 1 == 1){
            System.out.print("Please enter the " + (count + 1) + "st number or 0 to [Quite]: ");
        }else if(count + 1 == 2){
            System.out.print("Please enter the " + (count + 1) + "nd number: ");
        } else if (count + 1 == 3) {
            System.out.print("Please enter the " + (count + 1) + "rd number: ");
        }else{
            System.out.print("Please enter the " + (count + 1) + "th number: ");
        }

        return input.nextLine();
    }



}
