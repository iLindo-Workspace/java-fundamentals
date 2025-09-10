package Chapter5;

import java.util.Scanner;

/**
 * @author Lindouhle Makanda
 *  - Ask user to enter 3 names, the name should be stored inside the array only if it is 4 or more characters long
 */
public class GetUserInput
{
    public static void main(String[] args)
    {
        String[] arrNames = new String[3];
        Scanner input = new Scanner(System.in);
        String name = "";

        int count  = 0;
        while(count < 3)
        {
            System.out.print("Enter name with at least 4 characters: ");
            name = input.nextLine();

            if(name.isEmpty() || name.length() < 4 || name.matches(".*\\d.*"))
            {
                    System.out.println("Invalid input");
                    continue;
            }

            arrNames[count] = name;
            count++;

        }

//        for (int i = 0; i < arrNames.length; i++)
//        {
//            do{
//                System.out.print("Enter name with at least 4 characters: ");
//                name = input.nextLine();
//
//                if(name.isEmpty() || name.length() < 4 || name.matches(".*\\d.*") ) {
//                    System.out.println("Invalid input");
//                }
//            }while(name.length() < 4);
//
//            arrNames[i] = name;
//        }

        for(String n : arrNames){
            System.out.println(n);
        }

    }
}
