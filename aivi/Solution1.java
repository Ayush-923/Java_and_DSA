public class Solution1 {
    public static int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        int MaxWealth =0;
        for(int i=0;i<n;i++)
        {
            int sum = 0;
            for(int j=0;j<m;j++)
            {
                sum += accounts[i][j];
            }
            MaxWealth = Math.max(MaxWealth,sum);
        }
        return MaxWealth;
    }

    public static void main(String[] args) {
        int accounts[][] = {{1, 1, 3}, {3,5,7}};
        System.out.println(maximumWealth(accounts));
    }
}
