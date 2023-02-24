import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
    
    public static void main(String[] args) {
        HashSet<String> citi = new HashSet<>();
        citi.add("Delhi");
        citi.add("UP");
        citi.add("MP");
        citi.add("NOIDA");
        citi.add("MUMBAI");

        //METHOD-1
        Iterator it = citi.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //METHOD-2
        for(String city : citi)
        {
            System.out.println(city);
        }
    }
}
