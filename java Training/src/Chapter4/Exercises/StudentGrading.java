package Chapter4.Exercises;

import java.time.Year;
import java.util.Scanner;

/**
 * @author Lindokuhle Makanda
 */


public class StudentGrading
{
    public static String FirstName;
    public static String LastName;
    public static String Grade;
    public static int BirthYear;
    public static int Age;
    public static int TestMark;



    public static void main(String[] args)
    {
       greetings();
       getStudentDetails();
       Grade = determineGrade(TestMark);
       Age =determineAge( BirthYear);
       displayOutput();
    }

    public static void greetings(){
        System.out.println("""
               Welcome to the Grading System!
               
               Please Provide the following required details:
               
               """);
    }

    public static void getStudentDetails()
    {
        Scanner input = new Scanner(System.in);
        boolean isDone = false;
        String name = "";
        String lastName = "";
        String birthYear = "";
        String testMark = "";
        String studentDetails = "";
        do{
            //Getting First Name

            do{
                System.out.print("\nPlease enter your first name: ");
                name =  input.nextLine();
                if(name.matches(".*\\d.*")){
                    System.out.println("Your first name cannot contain numbers");
                }

            }while(name.matches(".*\\d.*"));

            FirstName = name;

            //Getting Last Name
            do{
                System.out.print("\nPlease enter your Last name: ");
                lastName =  input.nextLine();
                if(lastName.matches(".*\\d.*")){
                    System.out.println("Your last name cannot contain numbers");
                }

            }while(lastName.matches(".*\\d.*"));

            LastName =  lastName;

            //Getting Birth Year
            do{
                System.out.print("\nPlease enter your Birth Year: ");
                birthYear = input.next();

                if(!birthYear.matches("\\d+") || birthYear.length() != 4){
                    System.out.println("Your birth year must contain digits only and be a maximum of 2 digits");
                }

            }while (!birthYear.matches("\\d+") || birthYear.length() != 4);


            BirthYear = Integer.parseInt(birthYear);

            //Getting Test Marks

            do{
                System.out.print("\nPlease enter your Test Mark: ");
                testMark = input.next();

                if(!testMark.matches("\\d+") || testMark.length() > 3){
                    System.out.println("Your test mar must contain digits only and be a maximum of 3 digits");
                    continue;
                }
                int checkRange = Integer.parseInt(testMark);
                if (checkRange > 100) {
                    System.out.println("Your test mark cannot be greater than 100");
                    continue;
                }

                TestMark = checkRange;
                break;
            } while (true);




            isDone = true;

        }while(isDone == false);


    }


    public static String determineGrade(int testMark)
    {
       if(testMark >= 90){
           return "A+";
       } else if (testMark >= 80 && testMark <= 89) {
           return "A";
       } else if (testMark >= 70 && testMark <= 79) {
           return "B";
       } else if (testMark >= 60 && testMark <= 69) {
           return "C";
       } else if (testMark >= 50 && testMark <= 59) {
           return "D";
       } else if (testMark >= 40 && testMark <= 49) {
           return "D-";
       }else{
           return "F";
       }
    }

    public static int determineAge( int birthYear) {
        return Year.now().getValue() - birthYear;
    }

    public static void displayOutput()
    {
        System.out.println(String.format("""
                Your Details:
                ===================
                First name: %s
                Last Name: %s
                Birth Year: %s
                Your Age: %s
                Test Mark: %s
                Grade: %s
                
                """, FirstName,LastName,BirthYear,Age,TestMark,Grade));
    }

}
