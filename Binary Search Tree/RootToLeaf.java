import java.util.ArrayList;

public class RootToLeaf {
    
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

    public static void printPath(ArrayList<Integer> path)
    {
        for(int i=0; i<path.size(); i++)
        {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path)
    {
        if(root == null)
        {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null)
        {
            printPath(path);
        }

        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }


    public static void main(String[] args) {
        int value[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;
        for(int i=0; i<value.length; i++)
        {
            root = insert(root, value[i]);
        }

        printRoot2Leaf(root, new ArrayList<>());
    }
}
