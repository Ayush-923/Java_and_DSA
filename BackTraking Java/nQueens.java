public class nQueens {


    public static boolean isSafe(char board[][], int row, int col)
    {
        //virticaly up
        for(int i = row-1; i>=0; i--)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }
        //diagonal left side
        for(int i=row-1, j = col-1; i>=0 && j>=0; i--,j--)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }
        //diagonal right side
        for(int i=row-1, j = col+1; i>=0 && j<board.length; i--,j++)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }
        return true;
    }
    
    public static void nQueen(char board[][], int row)
    {
        //base
        if(row == board.length)
        {
            printBoard(board);
            count++;
            return;
        }
        //kaam
        for(int j=0; j<board.length; j++)
        {
            if(isSafe(board, row, j))
            {
            board[row][j] = 'Q';
            nQueen(board, row+1);   //fuction call
            board[row][j] = 'x';    //backtracking
            }    
        }
    }

    static int count = 0;

    public static void printBoard(char board[][])
    {
        System.out.println("-----Board------");
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        //initialize
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                board[i][j] = 'x';
            }
        }
        nQueen(board, 0);
        System.out.println("No. of solution is: "+count);
    }
}
