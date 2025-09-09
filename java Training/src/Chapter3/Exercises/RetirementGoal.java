package Chapter3.Exercises;

import java.util.Scanner;

/**
 * @author Lindokuhle Makanda
 *  - Exercise 3.2 about retirement
 */
public class RetirementGoal
{
    public static void main(String[] args)
    {
        //Declare
        int numOfYearsUntilRetirement;
        double amountTheUserCanSave;
        final double ANNUAL_INTEREST = 0.10;
        double totalSavings = 0;
        Scanner sc = new Scanner(System.in);

        do{
             //Get user input
               System.out.print("Please enter your years until retirement:");
               //Ensure no letters are entered
               while(!sc.hasNextInt()){
                   System.out.println("Only Whole Numbers are allowed!");
                   sc.next();
                   System.out.print("Please enter your years until retirement:");
               }
                numOfYearsUntilRetirement = sc.nextInt();


                System.out.print("\nPlease enter the amount you can save annualy:");
                while(!sc.hasNextDouble()){
                    System.out.println("No Letters Allowed");
                    sc.next();
                    System.out.print("Please enter the amount you can save annualy:");
                }
                amountTheUserCanSave =sc.nextDouble();

                //Check if any of the value provided is equal to 0
                if(numOfYearsUntilRetirement <= 0 || amountTheUserCanSave <= 0){
                    System.out.println("None of your values can be 0 or less\n");
                }
        }while(numOfYearsUntilRetirement == 0 && amountTheUserCanSave == 0);


        for (int i = 1; i <= numOfYearsUntilRetirement ; i++)
        {
            totalSavings = (totalSavings + amountTheUserCanSave) * (1 + ANNUAL_INTEREST);
        }


        System.out.println("\n\nRetirement Calculations:\n===============================\n" +
                          String.format("""
                                  Years: %d
                                  Amount you can save: R%.2f
                                  
                                  Total Retirement Money: R%.2f
                                  """, numOfYearsUntilRetirement, amountTheUserCanSave , totalSavings));
    }
}
