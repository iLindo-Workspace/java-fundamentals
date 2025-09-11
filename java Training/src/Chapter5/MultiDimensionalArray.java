package Chapter5;

public class MultiDimensionalArray
{
    public static void main(String[] args)
    {
        String[] arrStudents = new String[]{"John", "Kate", "Jessica", "Carol"};
        int[][] arrTestMarks = new int[][]{{75,74,36},{85,69,74},{74,52,46},{69,74,52}};

        System.out.println("\t\t   Test 1  Test 2  Test 3");
        for(int row = 0; row < arrStudents.length; row++)
        {
            System.out.print(arrStudents[row] + "\t\t");
            for(int column = 0; column < arrTestMarks[row].length; column++)
            {

                System.out.print(arrTestMarks[row][column] + "\t\t");
            }
            System.out.println("\n");
        }

    }
}
