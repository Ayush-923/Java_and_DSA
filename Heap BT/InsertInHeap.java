import java.util.ArrayList;

public class InsertInHeap {
    
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data)
        {
            //add at last index
            arr.add(data);

            int childIdx = arr.size()-1;
            int parIdx = (childIdx-1)/2;
            
            while(arr.get(childIdx) < arr.get(parIdx))
            {
                //swap
                int temp = arr.get(childIdx);
                arr.set(childIdx, arr.get(parIdx));
                arr.set(parIdx, temp);
            }
        }
        public int peek()
        {
            return arr.get(0);
        }
    }

    public static void main(String[] args) {
        
    }
}
