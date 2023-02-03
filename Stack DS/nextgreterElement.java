//next greater right - this one
//next greater left - (i=0; i<arr.length; i++)
//next smallest right - (arr[s.peek()] >= arr[i])
//next smallest left - (i=0; i<arr.length; i++) 
        //ALSO CHANGE  (arr[s.peek()] >= arr[i])

import java.util.*;
public class nextgreterElement {
    //O(n)
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();

        int nextgrtr[] = new int[arr.length];
    
        for(int i=arr.length-1; i>=0; i--)
        {
            //1 while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i])
            {
                s.pop();
            }

            //2 if-else
            if(s.isEmpty())
            {
                nextgrtr[i] = -1;
            }
            else
            {
                nextgrtr[i] = arr[s.peek()];
            }

            //3 push in s9
            s.push(i);
        }

        for(int i=0; i<nextgrtr.length; i++)
        {
            System.out.print(nextgrtr[i]+" ");
        }
        System.out.println();
    }
}
