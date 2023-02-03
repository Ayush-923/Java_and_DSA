public class reomveDuplicates {

    public static void removeduplicates(String str, int index, StringBuilder newstr, boolean map[])
    {
        //base case
        if(index == str.length()) //n*n*n*n*n = n^n
        {
            System.out.println(newstr);
            return;
        }

        //kaam
        char currChar = str.charAt(index);
        if(map[currChar - 'a'] == true)
        {
            //duplicate character
            removeduplicates(str, index+1, newstr, map);    // a->a->b->b->c
        }
        else
        {
            //new character
            map[currChar - 'a'] = true;
            removeduplicates(str, index+1, newstr.append(currChar), map); //abcd
        }

    }

    public static void main(String[] args) {
        String str = "aabbccdc"; //a
        int index = 0;
        StringBuilder newstr = new StringBuilder("");
        boolean map[] = new boolean[26]; //[false, false, false, false, false,......]
                                         //[  a,    b,      c,      d,      e, ........]
                                         //[true, true, false, false, false,......]
        removeduplicates(str, index, newstr, map);
    }
}
