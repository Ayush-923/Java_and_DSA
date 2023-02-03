public class bubblesort {

    public static void bubble_sort(int arr[])
    {
        //THE OUTER LOOP WILL RUN FOR (N-1) TIMES: N IS THE NUMBER OF ELEMENTS IN ARRAY.
        for(int turn=0; turn<arr.length-1; turn++)
        {
            //THE INNER LOOP FOR (N-1-TURN) TIMES.
            for(int j=0; j<arr.length-1-turn; j++)
            {
                if(arr[j]> arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //FOR PRINITING THE ARRAY
    public static void printbubbleSort(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        bubble_sort(arr);
        printbubbleSort(arr);

    }
}