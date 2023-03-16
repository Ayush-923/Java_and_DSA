public class LongestWordPrefix {
    
    public static class Node {
        Node childern[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                childern[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // Insertion
    public static void insert(String word) {
        Node curr = root;
        for (int lvl = 0; lvl < word.length(); lvl++) {
            int idx = word.charAt(lvl) - 'a';

            if (curr.childern[idx] == null) {
                curr.childern[idx] = new Node();
            }
            curr = curr.childern[idx];
        }
        curr.eow = true;
    }

    // Searchion
    // public static boolean Search(String key) {
    //     Node curr = root;
    //     for (int lvl = 0; lvl < key.length(); lvl++) {
    //         int idx = key.charAt(lvl) - 'a';

    //         if (curr.childern[idx] == null) {
    //             return false;
    //         }
    //         curr = curr.childern[idx];
    //     }
    //     return curr.eow == true;
    // }

    public static String ans  ="";
    public static void longestWord(Node root, StringBuilder temp)
    {
        Node curr = root;
        if(curr == null)
        {
            return;
        }

        for (int i = 0; i < 26; i++) {
            if(curr.childern[i] != null && curr.childern[i].eow == true)
            {
                //1
                temp.append((char)(i+'a'));

                //2
                if(temp.length() > ans.length())
                {
                    ans = temp.toString();
                }

                // 3
                curr = curr.childern[i];
                longestWord(curr, temp);

                //4
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }



    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
