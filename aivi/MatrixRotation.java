import java.util.ArrayList;
import java.util.Arrays;

public class MatrixRotation {

        public static  boolean findRotation(int[][] mat, int[][] target) {
            //run loop 4 times
            for(int i=0; i<4; i++)
            {
                if(isEquall(mat, target)) return true;

                    mat = transpose(mat);
            }
            return false;
        }

        public static int[][] transpose(int[][] mat)
        {
            int n = mat.length - 1;
            int res[][] = new int[mat[0].length][mat.length];
            for(int i=0; i<mat.length; i++)
            {
                for(int j=0; j<mat.length; j++)
                {
                    res[i][n-j] = mat[j][n-i];
                }
            }
            printmtrx(mat);
            return res;
        }

        public static boolean isEquall(int mat[][], int target[][])
        {
            if(mat.length != target.length) return false;
            if(mat[0].length != target[0].length) return false;

            for(int i=0; i<mat.length; i++)
            {
                for(int j=0; j<mat.length; j++)
                {
                    if(mat[i][j] != target[i][j])
                    {
                        return false;
                    }
                }
            }
            return true;            
        }

        public static void printmtrx(int[][] mat)
        {
            for(int i =0; i<mat.length; i++)
            {
                for(int j=0; j<mat.length; j++)
                {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
                ArrayList<Integer> arr = new ArrayList<>()
            }
        }

        public static void main(String[] args) {
            int[][] mat = {{0,0,0}, {0,1,0}, {1,1,1}};
            int[][] target = {{1,0}, {0,1}};

            printmtrx(mat);
            System.out.println("transpose is: ");
            transpose(mat);
            System.out.println(findRotation(mat, target));
        }

}

