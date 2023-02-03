public class naturalSum {

    public static int calcSum(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        int Snm1 = calcSum(n-1);
        int sn = n + Snm1;
        return sn;
    }

    public static void main(String[] args) {
        
        System.out.println(calcSum(5));
    }
}
