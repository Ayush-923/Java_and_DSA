public class AddinMiddlell {

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

    // Add Node at the starting of the Linked List
    public void addFirst(int data) {
        // Step1: Create a new Node
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        // Step2: newNode next = Head
        newNode.next = Head;

        // Step3: Head = newNode
        Head = newNode;
    }

    // Adding element through the back of the LinkedList
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode;
        }
        Tail.next = newNode;
        Tail = newNode;
    }

    // Middle of the LinkedList
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

        // i = index-1; temp ->previous
        newNode.next = temp.next;
        temp.next = newNode;
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
        AddinMiddlell ll = new AddinMiddlell();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.MiddleofLL(2, 3);

        ll.printLL();
        System.out.println(AddinMiddlell.size);
        
    }
}
