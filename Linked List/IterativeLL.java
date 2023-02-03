public class IterativeLL {

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


    //Add in the Linked List
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

    //ITERATIV SEARCH
    public int itrSearch(int key)
    {
        Node temp = head;
        int i = 0;

        while(temp != null)
        {
            if(temp.data == key)
            {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //PRINT THE LINKED LIST
    public void print()
    {
        if(head == null)
        {
            System.out.println("LL is Empty.");
            return;
        }
        Node temp =head;
        while(temp != null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        IterativeLL l1 = new IterativeLL();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        l1.print();
        System.out.println(l1.itrSearch(3));;

    }
}