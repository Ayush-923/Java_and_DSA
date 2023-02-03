public class LinearSearch {

    public static int linear_Search(int number[], int key) {
        
        for(int i=0; i<=number.length; i++)
        {
            if(number[i] == key)
            {
                return i;
            }
        }
        
        return -1;
    }


    public static void main(String[] args) {
        int number[] = {2, 4, 5, 6, 7, 10, 20, 12, 14, 9};
        int key = 20;   
        
        int index = linear_Search(number, key);
        if(index == -1)
        {
            System.out.println("NOT Found");
        }
        else
        {
            System.out.println("Index at: "+index);
        }
    }
    
}
