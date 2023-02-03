import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class luckyNum1380 {

    public List<Integer> luckyNumbers(int[][] matrix) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) 
        {
            
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix.length; j++) 
            {
                min = Math.min(min, matrix[i][j]);
            }
            arr.add(i, min);;
        }


        LinkedList<Integer> maxcol = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) 
        {
            max = Math.max(max, arr.get(i) );
        }
        maxcol.add(0, max);
        return maxcol;
    }

}
