public class clearrangeith {
    
    public static int CleareithBit(int n, int i, int j)
    {
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int Bitwise = a | b;
        System.out.println("Clear Bits in range for "+ i+" to "+j+" will be:  ");
        return n & Bitwise;
    }

    public static void main(String[] args) {
        System.out.println(CleareithBit(10, 2, 4));
    }
}
