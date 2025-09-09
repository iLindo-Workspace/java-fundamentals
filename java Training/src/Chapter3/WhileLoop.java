package Chapter3;

/**
 * @authorcLindokuhle Makanda
 * Use While loop when you don't know the number of iterations.
 * While loop will continue to run until the condition id false
 */
public class WhileLoop
{
    public static void main(String[] args) {
         int count = 1;

         while(count <= 5){
             System.out.println("Count = " + count);
             count+=2;
         }
    }
}
