public class deletetheNthLL {
    
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
            System.out.println("LL not present");
            return;
        }
        Node temp = head;
        while(temp !=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteNthfromlast(int n)
    {
        //calculate size of ll
        int sz = 0;
        Node temp = head;
        while(temp != null)
        {
            temp = temp.next;
            sz++;
        }

        //if n = n or the last element from last = first element
        if(n == sz)
        {
            head = head.next;
            return;
        }

        //go to the size-nth term and delete the next term to it
        int i=0;
        int itoFind = sz - n;
        Node prev = head;
        while(i < itoFind)
        {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }
    public static void main(String[] args) {
        
        deletetheNthLL ll = new deletetheNthLL();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print();

        ll.deleteNthfromlast(3);
        ll.print();
    }

}
