import java.util.Arrays;
import java.util.Collections;

public class ChocolateProblem {
    
    public static void main(String[] args) {
        //size is on 4x6

        Integer costVer[] = {2, 1, 3, 1, 4};    //6-1 = 5
        Integer costHor[]  ={4, 1, 2};          //4-1 = 3

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h=0, v=0;
        int hp=1, vp=1;
        int cost = 0;

        while(h<costHor.length && v<costVer.length)
        {
            //horizontal cut
            if(costVer[v] <= costHor[h])
            {
                cost += (costHor[h] * vp);
                hp++;
                h++;
            }
            else
            {
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        //Remaining horizontal parts
        while(h < costHor.length)
        {
            cost += (costHor[h] * vp);
                hp++;
                h++;
        }

        //Remaining vertical parts
        while(v < costVer.length)
        {
            cost += (costVer[v] * hp);
                vp++;
                v++;
        }

        System.out.println("Minimum cost to cut chocolate: "+ cost);
    }
}
