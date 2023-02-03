import java.util.Arrays;
import java.util.Collections;

public class inbuiltsort {
    
    public static void main(String[] args) {
        Integer arr[] = {5, 4, 1, 3, 2};


//FOR SORTING THE ARRAY WE USE BELOW CODE:
        // Arrays.sort(arr, 0, 3);


//FOR SORTING IN REVERSE ORDER USE THIS CODE:
        Arrays.sort(arr, Collections.reverseOrder());

//CODE TO PRINT THE ARRAY:
        System.out.println("The Array will be: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
