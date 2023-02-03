public class clearlastithBit {
    
    public static int clearithbit(int n, int i)
    {
        int bitmask = (~0)<<i;
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearithbit(15, 2));
    }
}