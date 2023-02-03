public class tilingProblem {
    
    public static int tilingProb(int n)
    {
        //Base Case
        if(n == 0 || n == 1)
        {
            return 1;
        }

        //vertical choice
        int fnm1 = tilingProb(n-1);

        //horizontal choice
        int fnm2 = tilingProb(n-2);

        int totways = fnm1 + fnm2;
        return totways;
    }
    public static void main(String[] args) {
        
        System.out.println(tilingProb(4));

    }
}
