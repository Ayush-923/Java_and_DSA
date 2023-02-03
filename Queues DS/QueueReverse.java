import java.util.*;

public class QueueReverse {
    
    public static void reverseQueue(Queue<Integer> q)
    {
        Stack<Integer> s = new Stack<>();

        //add in stack
        while(!q.isEmpty())
        {
            s.push(q.remove());
        }

        //add back in queue
        while(!s.isEmpty())
        {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverseQueue(q);

        while(!q.isEmpty())
        {
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
}
