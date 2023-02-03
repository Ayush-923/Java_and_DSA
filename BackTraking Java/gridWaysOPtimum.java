public class gridWaysOPtimum {
    public static int printoptgridways(int i, int j, int n, int m)
    {
        //base case
        if(i == n-1 && j == m-1)    //LAST CELL CONDITION
        {
            return 1;
        }
        else if(i==n || j==n)       //BOUNDARY CONDITION
        {
            return 0;
        }
        //kaaam

        //calulating total number of ways
        int num = n-1+m-1;
        if(num ==0 )
        {
            return 1;
        }
        printoptgridways(i, j, n-1, m-1);
        int up = n * printoptgridways(i, j, n-1, m-1);


        //calculating total numbers of repetative ways
        int a = n-1;
        int b = m-1;
        if(a == 0 && b == 0)
        {
            return 1;
        }
        int a1 = printoptgridways(i, j, n-1, m);
        int b1 = printoptgridways(i, j, n, m-1);

        int down =a1 * b1;


        //returning the numbers of grid ways
        return up/down;
        
    }

    public static void main(String[] args) {
        int n=4, m=4;
        System.out.println(printoptgridways(0, 0, n, m));
    }
}
