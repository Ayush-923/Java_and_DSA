public class mergeSort {


    public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void mergesort(int arr[], int si, int ei) //arr[0,1,2,3,4,5] = 6
    {
        //base case
        if(si >= ei)
        {
            return;
        }

        //work done
        int mid = si + (ei-si)/2;       // 0 + 5/2 = 2 // 0+2/2 = 1 //3 + 2/2 = 4

        //for Left breaking
        mergesort(arr, si, mid);        //{0,1,2}   //{0,1} //{0}  //{3,4}  //{3}

        //for right breaking
        mergesort(arr, mid+1, ei);      //{3,4,5}  //{2}   //{1}   //{5}   //{4}

        //call the merge function
        merge(arr, si, mid, ei);
    }


    public static void merge(int arr[], int si, int mid, int ei)
    {
        //Create temporary Array
        //left(0, 3) = 4 && right(4, 6) = 3
        //So total element is 7 i.e ( + 6 - 01) = 7

        int temp[] = new int[ei-si+1];
        int i = si; //Iterator for left part
        int j = mid+1; //Iterator for right part
        int k = 0;      //Iterator for temp array.

        while(i <= mid && j<=ei)
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;                //i=0 -> 1
            }
            else
            {
                temp[k] = arr[j];
                j++;                //j=2 -> 3
            }
            k++;
        }

        //For leftover Left elements
        while(i <= mid)
        {
            temp[k++] = arr[i++];
        }

        //For leftover Right Elements
        while(j <= ei)
        {
            temp[k++] = arr[j++];
        }


        //copy temporary to my orignal array
        for(k=0, i= si; k<temp.length; k++, i++)
        {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 2, 8};
        mergesort(arr, 0, arr.length-1);
        printArr(arr); 
    }
}
