package Chapter2.Exercise;

import java.util.Scanner;

import static java.lang.Character.toLowerCase;

/**
 * @author Lindokuhle Makanda
 * - This calss will handle the booking of Rooms
 */
public class RoomPrice
{
    public static double QUEEN_BED_PRICE = 125;
    public static double KING_BED_PRICE = 139;
    public static double SUIT_WITH_KING_PULLOUT_PRICE = 165;

    public static String ChooseBedType()
    {
        Scanner sc = new Scanner(System.in);
        String bedType = "";

        System.out.println("You're about to choose bed you want in your room");
        do {
            System.out.print("Enter a for \"Queen bed\", b for \"King bed\", or c for \"King and Pullout Couch bed\": ");
            bedType = sc.nextLine();

            if(!(bedType.equalsIgnoreCase("a") ||
                    bedType.equalsIgnoreCase("b") ||
                    bedType.equalsIgnoreCase("c"))){
                System.out.println("Invalid Input");
            }

        } while (!(bedType.equalsIgnoreCase("a") ||
                bedType.equalsIgnoreCase("b") ||
                bedType.equalsIgnoreCase("c")));

        return bedType.toLowerCase();


    }

    public static  Integer ChooseRoomType()
    {
        Scanner sc = new Scanner(System.in);
        int roomType = 0;

        System.out.println("\nYou're about to choose a room");
        do {
            System.out.print("Enter 1 for \"Lake View\", 2 for \"Park View\": ");
            roomType = sc.nextInt();

            if(roomType != 1 && roomType != 2){

                System.out.println("Invalid Input");
            }

        } while (roomType != 1 && roomType != 2);

        return roomType;
    }
    public static void main(String[] args)
    {

        double totalCost = 0;
        String bedType = ChooseBedType();
        int roomType = ChooseRoomType();

        if(roomType == 1){
            switch(bedType){
                case "a":
                    totalCost = QUEEN_BED_PRICE + 15;
                    break;
                case "b":
                    totalCost = KING_BED_PRICE + 15;
                    break;
                case "c":
                    totalCost = SUIT_WITH_KING_PULLOUT_PRICE + 15;
                    break;

            }
        }else{
            switch(bedType) {
                case "a":
                    totalCost = QUEEN_BED_PRICE;
                    break;
                case "b":
                    totalCost = KING_BED_PRICE;
                    break;
                case "c":
                    totalCost = SUIT_WITH_KING_PULLOUT_PRICE;
                    break;

            }
        }

        String roomTypeString = "";

        if(roomType == 1){
            roomTypeString = "Lake View";
        } else{

            roomTypeString = "Park View";
        }

        String result = "\n\nDETAILS\n=================================================\n" +
                String.format("""
                Bed Type Prices:  
                \t $%.2f for Queen bed
                \t $%.2f for King bed
                \t $%.2f for King and Pullout Couch
                
                
                Room Type with Lake View: $%.2f Added
                
                Bed Type Chosen: %s 
                Room Type Chosen: %s 
                
                Total Cost: $%.2f
                """, QUEEN_BED_PRICE,KING_BED_PRICE,SUIT_WITH_KING_PULLOUT_PRICE, 15.00, bedType, roomTypeString, totalCost);

        System.out.println(result);
    }
}
