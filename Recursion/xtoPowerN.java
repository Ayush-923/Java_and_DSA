public class xtoPowerN {

    public static int power(int x, int n)
    {
        if(n == 0){
            return 1;
        }

        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }

    //OPTIMIZED POWER CLASS
    public static int optimizedPower(int a, int n)
    {
        if( n == 0)
        {
            return 1;
        }

        int halfpower = optimizedPower(a, n/2);
        int halfpowersqr = halfpower * halfpower;

        //n is odd
        if(n % 2 !=0)
        {
            halfpowersqr = a * halfpowersqr;
        }

        return halfpowersqr;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 4));

        System.out.println(optimizedPower(2, 5));
    }
}
