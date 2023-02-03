public class removelastLL {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node Head;
    public static Node Tail;
    public static int size;

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        newNode.next = Head;
        Head = newNode;
    }

    // From Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode;
        }
        Tail.next = newNode;
        Tail = newNode;
    }

    // In the middle
    public void MiddleofLL(int index, int data) {
        if(index == 0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = Head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


    //REMOVE LAST
    public int RemoveLast()
    {
        if(size == 0)
        {
            System.out.println("LL is empety");
            return Integer.MIN_VALUE;
        }
        else if(size == 1)
        {
            int val = Head.data;
            Head = Tail = null;
            size = 0;
            return val;
        }

        //prevous node: i = size-2 (previous to last node)
        Node prev = Head;
        for(int i=0; i<size-2; i++)
        {
            prev = prev.next;
        }
        int val = Tail.data;
        prev.next = null;
        Tail = prev;
        size--;
        return val;
    }


    // Print data
    public void printLL() {
        if (Head == null) {
            System.out.println("LL is Emptey ");
            return;
        }
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        removelastLL ll = new removelastLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.MiddleofLL(2, 3);
        ll.printLL();
        ll.RemoveLast();
        ll.printLL();
    }
}
