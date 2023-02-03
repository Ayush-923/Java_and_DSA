public class firstOccurance {
    
    public static int firstoccr(int arr[], int key, int i){
        if(i == arr.length)
        {
            return -1;
        }

        if(arr[i] == key)
        {
            return i;
        }
        return firstoccr(arr, key, i+1);
    }

    public static void main(String[] args) {

        int arr[] = {5, 2, 8, 4, 5, 1, 9, 6, 10};
        System.out.println(firstoccr(arr, 8, 0));
    }
}
