public class trappingWater {

    public static int tapping_rainwater(int height[])
    {
        int n = height.length;

        //LEFT MAXIMUM KI HEIGHT
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<leftMax.length; i++)
        {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //RIGHT MAXIMUM KI HEIGHT
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--)
        {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //LOOP COLLECTED WATER KA
        int trappingWater =0;

        for(int i=0; i<n; i++)
        {
            //WATERLEVEL = MINUMUM OF LEFT AUR RIGHT KE MAX KA
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //TRAPPING WATER = WATERLEVEL - HEIGHT[I]
            trappingWater += waterLevel - height[i];
        }

        return trappingWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("trapping water height is: "+tapping_rainwater(height));
    }
    
}
