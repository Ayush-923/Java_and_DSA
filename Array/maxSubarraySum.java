public class maxSubarraySum {
    
    public static void printmaxsubarray(int number[])
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++)
        {
            int start = i;
            currSum = 0;
            for(int j=i; j<number.length; j++)
            {
                int end = j;
                for(int k=start; k<=end; k++)
                {
                    currSum += number[k];
                }
                //Sum of the array at that time:
                System.out.println(currSum);

                //code for maximum sum
                if(maxSum < currSum)
                {
                    maxSum =currSum;
                }
            }
        }
        System.out.println("Max Sum of subarray is: "+maxSum);
    }

    public static void main(String[] args) { 
        int number[] = {1,-2,6,-1,3};
        printmaxsubarray(number);


    }
}
