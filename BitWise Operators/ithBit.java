public class ithBit {

    public static int getithBit(int n, int i)
    {
        //FOR FINDING THE iTH BIT
        // USE 1<<i
        //IT WILL ONLY CHECK THE iTH POSTION OF THAT OPERATOR
        //Eg: 1<<2 : 000000100
        int bitmask = 1<<i;
        if((n & bitmask) == 0 )
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }


    public static int setithBit(int n, int i)
    {
        //FOR GETTING THE NUMBER AT iTH POSTION FIRST DO THE LEFT SHIFT
        //i.e: 1<<i
        //THE DO AN OR(|) OPERATION OF IT WITH THAT NUMBER. FOR EG:
        // FOR 10 AT I=2
        // 1<<2 = 0000 0100
        //10 = 00000 1010
        //10 AT POSTION 2 : 10 | 1<<2 = 0000 1110 = 14
        int bitmask = 1<<i;
        return bitmask | n;
    }


    public static int clearithBit(int n, int i)
    {
        //use 1<<i to reach that bit
        // the use ~(1<<i)
        // then & the number with above term
        // using this only the value of chosen term become 0 and rest remain same
        //f0r 10 at i=1
        //~(1<<1) = 1111 1101
        //10 = 0000 1010
        // and of these terms will be: 0000 1000
        int bitmask = ~(1<<i);
        return bitmask & n;
    }


    public static int updateithBit(int n, int i, int newBit)
    {
        n = clearithBit(n, i);
        int Bitmask = newBit<<i;
        return n | Bitmask;
    }

    public static void main(String[] args) {
        System.out.println("Finding the i'th element");
        System.out.println(getithBit(10, 2)); 
        System.out.println();

        System.out.println("Seting the ith bit");
        System.out.println(setithBit(10, 2));
        System.out.println();

        System.out.println("Clearing the ith bit");
        System.out.println(clearithBit(10, 1));
        System.out.println();

        System.out.println("Update the ith bit");
        System.out.println(updateithBit(10, 2, 1));
        System.out.println();
    }
}
