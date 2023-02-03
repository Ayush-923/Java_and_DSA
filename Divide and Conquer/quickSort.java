public class quickSort {

    public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    System.out.println();
    }

    public static void Quicksort(int arr[], int si, int ei)
    {
        //base case
        if(si >= ei)
        {
            return;
        }

        int pIdx = partion(arr, si, ei);

        //left sort
        Quicksort(arr, si, pIdx-1); //-1 because PIdx is already sorted

        //right Side
        Quicksort(arr, pIdx + 1, ei); 
    }

    public static int partion(int arr[], int si, int ei)
    {
        int pivot = arr[ei];
        int i = si - 1; //make place for elemtents smaller than piviot
        
        for(int j = si; j < ei; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }


    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        Quicksort(arr, 0, arr.length -1);
        printArr(arr);
    }
}