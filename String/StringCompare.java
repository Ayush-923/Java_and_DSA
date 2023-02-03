public class StringCompare {
    
    public static void main(String[] args) {
        String s1 = "Tony";
        String s3 = new String("Tony");

        //TO COMPARE ONLY THE DATA OF A STRING WE USE
        if(s1.equals(s3))
        {
            System.out.println("The string are Equall.");
        }
        else
        {
            System.out.println("Strings are Not Equall.");
        }
    }
}
