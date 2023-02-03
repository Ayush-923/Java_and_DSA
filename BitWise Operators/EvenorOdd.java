public class EvenorOdd {

    public static void oddOrEven(int n)
    {
        int bitmask = 1;
        if((n & bitmask) == 0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        //FOR ODD NUMBERS: THE LSB(RIGHT MOST BIT) IS 1
        // 1 = 001
        // 3 = 011
        // 5 = 101
        
        //FOR EVEN NUMBERS: THE LSB IS 0
        // 0 = 000
        // 2 = 010
        // 4 = 100

        // IF WE DO & OF 1 WITH THAT NUMBER i.e
        // n & 1 = 1
        // 00000N & 000000...1 = 1 TRUE: THEN ODD
        //IFF FALSE THEN EVEN

        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(10);

    }
    
}
