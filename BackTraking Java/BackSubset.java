public class BackSubset {

    public static void findDubset(String str, int i, String ans)
    {
        //base case
        if(i == str.length())
        {
            if(ans.length() == 0)
            {
                System.out.println("null");

            }
            else{
                System.out.println(ans);
            }
            return;
        }

        //For Yes
        findDubset(str, i+1, ans+str.charAt(i));
        //For no
        findDubset(str, i+1, ans);
    }
    
    public static void main(String[] args) {
        String str = "abc";
        findDubset(str, 0, "");
    }
}
