package Chapter5.Exercises;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Lindokuhle Makanda
 */
public class ArrayMethodDemo
{
    public static int[] numbers = new int[8];
    public static void main(String[] args)
    {
        int option = 0;
        int limit = 0;
        numbers = getArrayNumbers();
        String carryOn = "";
        Scanner input = new Scanner(System.in);

        do
        {
            option = getOption();
            if(option == 1){
                displayAllValues();
            }else if(option == 2){
                displayAllValuesInReverse();
            } else if (option == 3) {
                displaySumOfArrayElements();
            } else if (option == 4) {
                do{
                    System.out.print("Please enter your limit number: ");

                    if(!input.hasNextInt()){
                        System.out.println("Please enter an integer");
                        input.nextLine();
                        continue;
                    }
                }while(!input.hasNextInt());

                limit = input.nextInt();
                input.nextLine();
                displayWithLimitingArgument(limit);
            } else if (option == 5) {
                valuesAboveAverage();
            }

            System.out.print("Do you want to check other options \"y\" for Yes or any keystroke: ");
            carryOn = input.nextLine();
             if(carryOn.equalsIgnoreCase("y"))
             {
                 continue;
             }else{
                 System.out.println("BYE!!!");
                 System.exit(0);
             }


        }while(true);

    }

    //Gets options from the user
    public static int getOption()
    {
        String option = "";
        Scanner input = new Scanner(System.in);
        int checkOption = 0;
        do
        {
            System.out.println(String.format("""
                    
                    
                    Choose from the options below for your next action:
                    ===================================================
                    (1) To display all your numbers
                    (2) To display them in reverse order
                    (3) To display the sum of all your numbers
                    (4) To provide a limiting number that will only display numbers less than it
                    (5) To display numbers greater than the average of your entire collection
                    (0) To STOP the program 
                    """));
            System.out.print("\nYour choice: ");
            option = input.nextLine();

            if(!option.matches("\\d+")){
                System.out.println("Only numbers are allowed, [0-5]!");
                continue;
            }else if(option.equals("0")){
                System.out.println("BYE!!!");
                System.exit(0);
            }else{
                checkOption = Integer.parseInt(option);
                if(checkOption > 5){
                    System.out.println("Please choose from the options provided which are [0-5]!");
                    continue;
                }
                return checkOption;
            }

        }while(true);
    }
    //getting the numbers from the user
    public static int[] getArrayNumbers()
    {
        int[] arrUserNumbers = new int[8];
        String number = "";
        int count = 0;

        System.out.println("""
                            You're about to be prompted to enter 8 numbers...
                            """);
        while(count < 8)
        {
            number = promptFormat(count);
            //Checking if it is 0 or contains letters

            if(!number.matches("\\d+")){
                System.out.println("Please enter digits only");
                continue;
            }


            arrUserNumbers[count] = Integer.parseInt(number);
            count++;

        }

        return arrUserNumbers;

    }

    //Prompt formatter
    public static String promptFormat(int count)
    {
        Scanner input = new Scanner(System.in);
        if(count + 1 == 1){
            System.out.print("Please enter the " + (count + 1) + "st number: ");
        }else if(count + 1 == 2){
            System.out.print("Please enter the " + (count + 1) + "nd number: ");
        } else if (count + 1 == 3) {
            System.out.print("Please enter the " + (count + 1) + "rd number: ");
        }else{
            System.out.print("Please enter the " + (count + 1) + "th number: ");
        }

        return input.nextLine();
    }
    //Display all ArrayValues: Option (1)
    public static void displayAllValues()
    {
        int count = 1;
        System.out.print("Your Numbers are: [");
        for(int num : numbers){

            if(count < numbers.length){
                System.out.print(num + ", ");
            }else{
                System.out.print(num + "]\n");
            }
            count++;
        }


    }

    //Display all integers in reverse: Option (2)
    public static void displayAllValuesInReverse()
    {
        System.out.print("\n\nIn Reverse: [");
        for(int i = numbers.length - 1; i >= 0; i--)
        {
            if(i != 0){
                System.out.print(numbers[i] + ", ");
            }else{
                System.out.print(numbers[i] + "]\n");
            }

        }
    }

    //Displaying the sum of the elements in the Array: Option (3)
    public static void displaySumOfArrayElements()
    {
        System.out.println("\n\nSum of Array Elements: " + Arrays.stream(numbers).sum() + "\n");
    }

    //Display all values less than the limiting argument: Option (4)
    public static void displayWithLimitingArgument(int limit)
    {
       boolean isFirstNum = true;

       System.out.print("\n\nDisplaying values less than " + limit + ": [");
       for(int num : numbers)
       {
          if(num < limit)
          {
              if(!isFirstNum)
              {
                  System.out.print(", ");
              }
              System.out.print(num);
              isFirstNum = false;
          }
       }
        System.out.println("]\n");
    }

    //Displaying values that are higher than the average user numbers: Option (5)
    public static void valuesAboveAverage()
    {
        double sum = 0;
        double arrAverage = 0;

        for(int num : numbers){
            sum += num;
        }
        arrAverage = sum / numbers.length;
        //Displaying the average
        System.out.println(String.format("""
                Average of your collection: %.2f
                """, arrAverage));


        boolean isFirstNum = true;
        System.out.print("Displaying values above average: [");

        for(int num : numbers)
        {
            if(num > arrAverage)
            {
                if(!isFirstNum)
                {
                    System.out.print(", ");
                }
                System.out.print(num);
                isFirstNum = false;
            }
        }
        System.out.print("]\n");


    }

}
