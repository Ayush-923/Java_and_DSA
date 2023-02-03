import java.util.ArrayList;

public class pairsum {
    

    public static boolean pairSum(ArrayList<Integer> list, int target)
    {
        int n = list.size();
        for(int i=0; i<n; i++)
        {
            for(int j= i+1; j<n; j++)
            {
                if((list.get(i) + list.get(j)) == target)
                {
                    System.out.println(i+","+j);
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;

        System.out.println(pairSum(list, target));

    }
}
