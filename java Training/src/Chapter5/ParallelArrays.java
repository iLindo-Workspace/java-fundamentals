package Chapter5;

/**
 * @author Lindokuhle Makanda
 */
public class ParallelArrays
{
    public static void main(String[] args)
    {
        String[] arrStudents = new String[]{"John", "Kate", "Jessica", "Carol"};
        int[] arrTestMarks = new int[]{58,74,78,79};

        int size = arrStudents.length;

        System.out.println("Student\tTest Mark");
        System.out.println("==================");

        for(int i = 0; i < size; i++){
            System.out.println(arrStudents[i] + "\t\t" + arrTestMarks[i]);
        }
    }
}
