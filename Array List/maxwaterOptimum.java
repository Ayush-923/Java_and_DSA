import java.util.ArrayList;

public class maxwaterOptimum {
    
    //  .. O(n) TC using this approch
    public static int printmaxWater(ArrayList<Integer> height)
    {
        int maxwater = Integer.MIN_VALUE;
        int lp = 0;
        int rp = height.size()-1;
        
        while(lp < rp)
        {
            //water area
            int h = Math.min(height.get(lp), height.get(rp));
            int w = rp - lp;
            int currwater = h * w;
            maxwater = Math.max(maxwater, currwater);

            //conditions
            if(height.get(lp) <= height.get(rp))
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return maxwater;
    
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(printmaxWater(height));
    }
}
