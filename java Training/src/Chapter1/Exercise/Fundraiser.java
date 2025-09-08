package Chapter1.Exercise;

import javax.swing.*;

/**
 * @author Lindokuhle Makanda
 * This class gets the total money collected from orders of both Adults and children's
 */
public class Fundraiser
{
    public static void main(String[] args)
    {
        //Meal prices
        final double ADULT_MEAL = 50.00;
        final double CHILD_MEAL = 37.50;

        int adultOrders;
        int childrenOrders;
        double totalPrice;

        //User inputs
        adultOrders = Integer.parseInt(JOptionPane.showInputDialog("Please enter total adult meal orders: "));
        childrenOrders = Integer.parseInt(JOptionPane.showInputDialog("Please enter total children meal orders: "));

        //Calculating the total
        totalPrice = (ADULT_MEAL * adultOrders) + (CHILD_MEAL * childrenOrders);
        String receipt = "Your Order Receipt\n=================================\n" +
                         String.format("""
                                 Total Adult Orders: %d x R%.2f per meal
                                 Total Children Orders: %d x R%.2f per meal
                                 
                                 
                                Total Due: R%.2f
                                 """,adultOrders,ADULT_MEAL, childrenOrders, CHILD_MEAL ,totalPrice);
        JOptionPane.showMessageDialog(null, receipt);
    }
}
