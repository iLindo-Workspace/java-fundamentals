package Chapter3;
/**
 * @author Lindokuhle Makanda
 *  Break: end / exit the loop
 *  Continue: Will skip the current iteration and start the next iteration
 */
public class TerminationTechniques
{
    public static void main(String[] args)
    {
        //break: exit/end loop prematurely
        //any statement after break will not be executed
        System.out.println("================BREAK==============");
        int executedNumber = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("i = " + i);
            executedNumber++;
            if(i == 5){
                System.out.println("The loop is executed " +  executedNumber + " times");
                break;
            }
        }

        //Continue: skips the current iteration
        System.out.println("\n\n================CONTINUE==============");
        for (int i = 0; i < 20; i++) {
            if(i % 5 == 0) continue;

            System.out.println("\ni = " + i);
        }
    }
}
