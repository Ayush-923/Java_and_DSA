public class validBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int value)
    {
        if(root == null)
        {
            root = new Node(value);
            return root;
        }

        if(root.data > value)
        {
            root.left = insert(root.left, value);
        }
        else if(root.data < value)
        {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static boolean isValidBST(Node root, Node min, Node max)
    {
        if(root == null)
        {
            return true;
        }
        if(min != null && root.data <= min.data)
        {
            return false;
        }
        if(max != null && root.data >= max.data)
        {
            return false;
        }

        return isValidBST(root.left, min, root)
            && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        int value[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;
        for(int i=0; i<value.length; i++)
        {
            root = insert(root, value[i]);
        }

        System.out.println();
        if(isValidBST(root, null, null))
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
