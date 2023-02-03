public class AddtoLL {
    

    //Initialisig the Linked List
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node Head;
    public static Node Tail;



    //Add Node at the starting of the Linked List
    public void addFirst(int data)
    {
        //Step1: Create a new Node
        Node newNode = new Node(data);
        if(Head == null)
        {
            Head = Tail = newNode;
            return;
        }

        //Step2: newNode next = Head
        newNode.next = Head;

        //Step3: Head = newNode
        Head = newNode;
    }



    //Adding element through the back of the LinkedList
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(Head == null)
        {
            Head = Tail = newNode;
        }
        Tail.next = newNode;
        Tail = newNode;
    }

//Print Linked List
    public void printll()
    {
        if(Head == null)
        {
            System.out.println("Ll is empty");
            return;
        }
        Node temp = Head;
        while(temp != null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {

        AddtoLL ll = new AddtoLL();
        ll.addFirst(2);
        ll.printll();
        ll.addFirst(1);
        ll.printll();
        ll.addLast(3);
        ll.printll();
        ll.addLast(4);
        ll.printll();
    }
}
