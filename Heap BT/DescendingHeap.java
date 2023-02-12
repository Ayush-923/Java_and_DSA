import java.util.ArrayList;

//To make the heap in descending order simply change the sign at some places
//1. in add method-> arr.get(childIdx) < arr.get(parIdx) change to ">"
//2. In heapify -> left<arr.size() && arr.get(minIdx)>arr.get(left) to "<"
//3. In heapify -> right<arr.size() && arr.get(minIdx)>arr.get(right) to "<"

public class DescendingHeap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data)
        {
            //add at last index
            arr.add(data);

            int childIdx = arr.size()-1;
            int parIdx = (childIdx-1)/2;

            //change 1
            while(arr.get(childIdx) > arr.get(parIdx))
            {
                //swap
                int temp = arr.get(childIdx);
                arr.set(childIdx, arr.get(parIdx));
                arr.set(parIdx, temp);


                childIdx = parIdx;
                parIdx = (childIdx-1)/2;
            }
        }

        public int peek()
        {
            return arr.get(0);
        }

        private void heapify(int i)
        {
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx=i;

            //2nd change
            if(left<arr.size() && arr.get(minIdx) < arr.get(left))
            {
                minIdx = left;
            }

            //3rd change
            if(right<arr.size() && arr.get(minIdx) < arr.get(right))
            {
                minIdx = right;
            }

            if(minIdx != i)
            {
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove()
        {
            int data = arr.get(0);


            //step1- swap the first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step2- Delete last array element
            arr.remove(arr.size()-1);

            //heapify call
            heapify(0);
            return data;
        }

        public boolean isEmpty()
        {
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        h.add(6);
        h.add(0);

        while(!h.isEmpty())
        {
            System.out.println(h.peek()+" ");
            h.remove();
        }
    }
}
