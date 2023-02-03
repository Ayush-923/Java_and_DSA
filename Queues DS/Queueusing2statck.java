import java.util.Stack;

public class Queueusing2statck {
    
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }

        public void add(int data)
        {
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove
        public int remove()
        {
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return s1.pop();
        }

        //peek
        public int peek()
        {
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty())
        {
            System.out.println(q.remove());
        }
    }
}
