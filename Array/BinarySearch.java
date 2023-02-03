public class BinarySearch {
    
    public static int Binary_Search(int number[], int key)
    {
        int start = 0;
        int end = number.length -1;
        
        while(start <= end)
        {
            int mid = (start + end) / 2;

            //comparision

            //for same
            if(number[mid] == key)
            {
                return mid;
            }

            //RIGHT
            if(number[mid] < key)
            {
                start = mid+1;
            }

            //LEFT
            if(number[mid] > key)
            {
                end = mid-1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 4;

        System.out.println("Index of "+key+" is at: "+Binary_Search(number, key));
    }
}
