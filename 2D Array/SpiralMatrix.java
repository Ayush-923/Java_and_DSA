public class SpiralMatrix {

    public static void Printspiral(int matrix[][])
    {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

    while(startRow<=endRow && startCol<=endCol)
    {
        //PRINTING THE TOP ROW
        for(int j=startCol; j<=endCol; j++)
        {
            System.out.print(matrix[startRow][j]+" ");
        }

        //PRINTING THE RIGHT COLOUMN
        for(int i=startRow+1; i<=endRow; i++)
        {
            System.out.print(matrix[i][endCol]+" ");
        }


        //PRINTING THE BOTTOM ROW
        for(int j=endCol-1; j>=startCol; j--)
        {
            if(startRow == endRow)
            {
                break;
            }
            System.out.print(matrix[endRow][j]+" ");
        }


        //PRINTING THE LEFT COLOUMN
        for(int i=endRow-1; i>=startRow+1; i--)
        {
            if(startCol == endCol)
            {
                break;
            }
            System.out.print(matrix[i][startCol]+" ");
        }
        startRow++;
        startCol++;
        endRow--;
        endCol--;
    }
    }

    public static void main(String[] args) 
    {
        int matrix[][]= {{1, 2, 3, 4},
                        {5, 6 ,7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        
        Printspiral(matrix);
    }
    
}
