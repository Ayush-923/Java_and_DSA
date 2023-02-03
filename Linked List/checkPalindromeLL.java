public class checkPalindromeLL {
    
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


    public Node midTerm(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;   //+1
            fast = fast.next.next; //+2
        }
        return slow;
    }

    public boolean LLpalindrome()
    {
        if(head == null || head.next == null)
        {
            return true;
        }
        //find the mid Node
        Node mid = midTerm(head);

        //reverse the 2nd half after mid
        Node prev = null;
        Node curr = mid;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;  //right node head
        Node left = head;   //left node head


        //compare both the LL
        while(right != null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        
        checkPalindromeLL ll = new checkPalindromeLL();
        ll.add(1);
        ll.add(2);
        ll.add(2);
        ll.add(1);
        ll.print();

        System.out.println(ll.LLpalindrome());;

    }
}
