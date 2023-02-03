public class recursiveLL {
    
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
    public static int size;

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
            System.out.println("LL not present");
            return;
        }
        Node temp = head;
        while(temp !=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public int helper(Node head, int key)
    {
        if(head == null)
        {
            return -1;
        }

        if(head.data == key)
        {
            return 0;
        }
        int idx = helper(head.next, key);

        if(idx == -1)
        {
            return -1;
        }
        
        return idx+1;
    }

    public int recSearch(int key)
    {
        return helper(head, key);
    }

    public static void main(String[] args) {
        
        recursiveLL ll = new recursiveLL();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print();

        System.out.println(ll.recSearch(3));;
        System.out.println(ll.recSearch(10));;
    }
}
