public class DiameterBT {
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

    public static int heightofBinary(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int lh  = heightofBinary(root.left);
        int rh = heightofBinary(root.right);
        return Math.max(lh, rh) + 1;
    }


    //TC == O(n^2) time
    public static int diameterBT(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int ldiam = diameterBT(root.left);
        int rdiam = diameterBT(root.right);
        int leftHT = heightofBinary(root.left);
        int rightHT = heightofBinary(root.right);
        int selfDiam = leftHT + rightHT + 1;

        return Math.max(Math.max(rdiam, ldiam), selfDiam);
    }
        public static void main(String[] args) {
        //           1
        //         /   \
        //        2     3   
        //      /  \  /  \
        //     4   5 6    7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameterBT(root));

        }
}
