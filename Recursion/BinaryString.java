public class BinaryString {

    public static void printBinarystring(int n, int lastPlace, String str)
    {
        //base case
        if(n == 0)
        {
            System.out.println(str);
            return;
        }
        //kaam
        // if(lastPlace == 0)
        // {
        //     //sit 0 on chair n
        //     printBinarystring(n-1, 0, str.append("0"));
        //     printBinarystring(n-1, 1, str.append("1"));
        // }
        // else{
        //     printBinarystring(n-1, 0, str.append("0"));
        // }
        //inshort
        printBinarystring(n-1, 0, str+"0");
        if(lastPlace == 0)
        {
            printBinarystring(n-1, 1, str+"1");
        }


    }


    public static void main(String[] args) {
        printBinarystring(3, 0, "");
    }
}
