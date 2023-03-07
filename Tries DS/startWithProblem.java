public class startWithProblem {
    
    public static class Node{
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node()
        {
            for(int i=0; i<children.length; i++)
            {
                children[i] = null;
            }
            freq = 1;
        }
    }
    public static Node root = new Node();

    
    public static void insert(String word)
    {
        Node curr = root;
        for(int i=0; i<word.length(); i++)
        {
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null)
            {
                curr.children[idx] = new Node();
            }
            else
            {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean startwith(String prefix)
    {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null)
            {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String arr[] = {"apple", "app", "mango", "man"};
        String p1 = "app";
        String p2 = "top";

        for (int index = 0; index < arr.length; index++) {
            insert(arr[index]);
        }

        System.out.println(startwith(p1));
        System.out.println(startwith(p2));

    }
}
