public class friendPair {

    public static int friendpair(int n)
    {
        //base case
        if(n == 1 || n == 2)
        {
            return n;
        }

        //for single
        int fnm1 = friendpair(n-1);

        //for pair
        int fnm2 = friendpair(n-2);
        int pairways = (n-1)*fnm2;

        int totalways = fnm1 + pairways;

        System.out.println("No. of ways of  will be: ");
        return totalways;
    }

    public static void main(String[] args) {
        System.out.println(friendpair(3));;
    }
}
