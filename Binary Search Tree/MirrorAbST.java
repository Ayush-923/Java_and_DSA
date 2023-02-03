public class MirrorAbST {
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

    public static Node Mirror(Node root)
    {
        if(root == null)
        {
            return null;
        }
        Node leftMirror = Mirror(root.left);
        Node rightMirror = Mirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    public static void preOder(Node root)
    {
        if(root == null)
        {
            return;
        }

        System.out.print(root.data+" ");
        preOder(root.left);
        preOder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        preOder(root);
        System.out.println();
        root = Mirror(root);
        preOder(root);
    }
}
