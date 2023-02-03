import java.time.chrono.IsoChronology;

public class cycleDetectLL {
    
    public static class Node{
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



    public void add(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }



    public void print()
    {
        if(head == null)
        {
            System.out.println("LL is not present");
            return;
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean isCycle()
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;       //+1
            fast = fast.next.next;  //+2
            if(slow == fast)
            {
                return true;    //cycle exist
            }
        }
        return false;
    }

    public static void main(String[] args) {
        cycleDetectLL ll = new cycleDetectLL();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        //1->2->3->1
        System.out.println(isCycle());
    }
}
