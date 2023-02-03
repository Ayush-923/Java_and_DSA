public class gridWays {
    public static int printgridways(int i, int j, int n, int m)
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
        
        //kaam
        int way1 = printgridways(i+1, j, n, m);
        int way2 = printgridways(i, j+1, n, m);
        return way1 + way2;
    }

    public static void main(String[] args) {
        int n=3, m=3;
        System.out.println(printgridways(0, 0, n, m));
    }
}
