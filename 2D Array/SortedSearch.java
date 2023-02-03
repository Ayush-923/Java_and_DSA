public class SortedSearch {

    public static boolean StairCaseMethod(int matrix[][], int key)
    {
        int row = 0, col = matrix.length-1;
        
        while(row < matrix.length && col >= 0)
        {
            if(matrix[row][col] == key)
            {
                System.out.println("THE KEY FOUND AT (" + row +"," + col +")" );
                return true;
            }

            else if(key < matrix[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }

        System.out.println("KEY NOT FOUND IN ARRAY");
        return false;
    }
    
    public static void main(String[] args) {
        int matrix[][]={{10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {27, 29, 37, 47},
                        {32, 33, 39, 50}};

        StairCaseMethod(matrix, 39);
    }
}
