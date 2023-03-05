public class WordBreak {
    
    public static class Node{
        Node charachter[] = new Node[26];
        boolean eow = false;

        Node()
        {
            for(int i=0; i<26; i++)
            {
                charachter[i] = null;
            }
        }
    }
    public static Node root = new Node();
    
    //Insert
    public static void insert(String word)
    {
        Node curr = root;
        for(int lvl=0; lvl<word.length(); lvl++)
        {
            int idx = word.charAt(lvl) - 'a';
            if(curr.charachter[idx] == null)
            {
                curr.charachter[idx] = new Node();
            }
            curr = curr.charachter[idx];
        }
        curr.eow = true;
    }

    //Search
    public static boolean search(String key)
    {
        Node curr = root;
        for(int lvl=0; lvl<key.length(); lvl++)
        {
            int idx = key.charAt(lvl) - 'a';
            if(curr.charachter[idx] == null)
            {
                return false;
            }
            curr = curr.charachter[idx];
        }
        return curr.eow == true;
    }

    public static boolean wordbreak(String key)
    {
        if(key.length() == 0)
        {
            return true;
        }

        for(int i=1; i<=key.length(); i++)
        {
            if(search(key.substring(0, i)) && wordbreak(key.substring(i)))
            {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        String key = "ilikesamsung";
        System.out.println(wordbreak(key));
    }
}
