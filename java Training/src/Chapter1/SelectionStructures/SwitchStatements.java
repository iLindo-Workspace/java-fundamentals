package Chapter1.SelectionStructures;

/**
 * @author Lindokuhle Makanda
 * - This class shows use of a switch statements.
 * Switch statements can be used to evaluate equality
 */
public class SwitchStatements
{
    public static void main(String[] args) {
        int dayOfWeek = 3;

//        if (dayOfWeek == 1) {
//            System.out.println("Monday");
//        } else if (dayOfWeek == 2) {
//            System.out.println("Tuesday");
//        } else if (dayOfWeek == 3) {
//            System.out.println("Wednesday");
//        } else if (dayOfWeek == 4) {
//            System.out.println("Thursday");
//        } else if (dayOfWeek == 5) {
//            System.out.println("Friday");
//        } else if (dayOfWeek == 6) {
//            System.out.println("Saturday");
//        } else if (dayOfWeek == 7) {
//            System.out.println("Sunday");
//        } else {
//            System.out.println("Invalid day");
//        }

        if (dayOfWeek == 1 || dayOfWeek == 2 || dayOfWeek == 3){
            System.out.println("Weekdays");
        } else if (dayOfWeek == 4) {
            System.out.println("Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("Friday");
        } else if (dayOfWeek == 6) {
            System.out.println("Saturday");
        } else if (dayOfWeek == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
                System.out.println("Weekdays");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: System.out.println("Invalid day");

        }

    }
}
