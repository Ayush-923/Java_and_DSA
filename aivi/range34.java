public class range34 {

        public static int[] searchRange(int[] nums, int target) 
        {
            boolean occur = false;
            int[] res = {-1, -1};
            int start = 0;
            int end = 0;
            for(int i=0; i<nums.length; i++)
            {
                if(nums[i] == target)
                {
                    occur = true;
                    start = i;
                    break;
                }
            }
            if(occur)
            {
                for(int j=start; j<nums.length; j++)
                {
                    if(nums[j] != nums[j+1])
                    {
                        end = j;
                    }
                }
                res[0] = start;
                res[1] = end;
                return res;
            }
    
            return res;
        }
    
}
