public class TriesImplementation {
    
    static class Node{
        Node childern[] = new Node[26];
        boolean endOfWord = false;

        Node()
        {
            for(int i=0; i<26; i++)
            {
                childern[i] = null;
            }
        }
    }
    public static Node root = new Node();


    //Insertion
    public static void insert(String word)
    {
        Node curr = root;
        for(int lvl=0; lvl<word.length(); lvl++)
        {
            int idx = word.charAt(lvl) - 'a';

            if(curr.childern[idx] == null)
            {
                curr.childern[idx] = new Node();
            }
            curr = curr.childern[idx];
        }
        curr.endOfWord = true;
    }


    public static void main(String[] args) {
        String words[] = {"the", "there", "thee"};
        
        for(int i=0; i<words.length; i++)
        {
            insert(words[i]);
        }
    }
}
