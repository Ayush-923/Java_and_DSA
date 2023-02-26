import java.util.HashMap;

public class LargestSubarraySumZero {

    public static void main(String[] args) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };

        HashMap<Integer, Integer> map = new HashMap<>();
        //(Sum, Idx)

        int sum = 0;
        int idx = 0;

        for(int i=0; i<arr.length; i++)
        {
            sum +=arr[i];
            if(map.containsKey(sum))
            {
                idx  = Math.max(idx, i - map.get(sum));
            }
            else
            {
                map.put(sum, i);
            }
        }
        System.out.println("largest subarray with sum as 0 is => "+idx);
    }
}
