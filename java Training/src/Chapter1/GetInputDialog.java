package Chapter1;

import javax.swing.*;
import java.math.RoundingMode;

/**
 * @author Lindokuhle Makanda
 * - This class demonstrates how to get inout from the user using dialog input box
 */

public class GetInputDialog
{
    public static void main(String[] args)
    {
        String firstname;
        char initial;
        int age;
        double height;
        float salary;
        boolean isMarried = true;

        firstname = JOptionPane.showInputDialog("Please enter your name: ");
        initial = firstname.charAt(0);
        age = Integer.parseInt( JOptionPane.showInputDialog("Please enter your age: "));
        height = Double.parseDouble(JOptionPane.showInputDialog("Please enter your height: "));
        salary = Float.parseFloat(JOptionPane.showInputDialog("Please enter your salary: "));

//        String message = "Your Details: \n=================\n" +
//                "Name: " + firstname + " (" + initial + ")" +
//                "\nAge: " + age +
//                "\nHeight: " + height +
//                "\nSalary: R" + String.format("%.2f",salary) +
//                "\nMarried: " + "(" + isMarried + ")" ;
        String message = "Your Details: \n=================\n" +
                String.format("""    
                 Name: %s (%s)
                 Age: %d
                 Height: %.2f
                 Salary: R%.2f
                 Married: (%b)""", firstname , initial, age, height, salary, isMarried);

        JOptionPane.showMessageDialog(null,  message);
    }
}
