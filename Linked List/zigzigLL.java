public class zigzigLL {


    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    //ADD IN THE LL
    public void addfirst(int data)
    {
        Node newNode= new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //PRINT THE LL
    public void printLL()
    {
        if(head == null)
        {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");     //[6 5 4 3 2 1]
    }

    public void zigZag()
    {
        //1. find the mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;            //mid  = [4]

        //2. Reverse the second half
        Node curr = mid.next;       //curr = [3]
        mid.next = null;            
        Node prev = null;           //prev = null
        Node next;                  
        while(curr != null)
        {   
            next = curr.next;       //next = [2]            //next = [1]
            curr.next = prev;       //node = [null<-3]  //node = [null<-3<-2]
            prev = curr;            //prev = [3]
            curr = next;            //curr = [2] (1st step)
        }
        //node =[1 2 3 null]

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //3. join the senecond and first half
        while(left != null && right != null)
        {
            //for zigzag adding
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            //updation
            left = nextL;
            right = nextR;
        }
    }
    public static void main(String[] args) {
        zigzigLL ll = new zigzigLL();
        ll.addfirst(6);
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.printLL();

        ll.zigZag();
        ll.printLL();
    }
}
