import java.util.HashMap;

public class HashMapImplement {
    
    public static void main(String[] args) {
        //create
        HashMap<Integer, String> hm = new HashMap<>();

        //Insert
        hm.put(1, "India");
        hm.put(2, "USA");
        hm.put(3, "Canada");

        System.out.println(hm);


        //GET Opertion
        String population = hm.get(1);
        System.out.println(population);

        //contains key
        System.out.println(hm.containsKey(2));
        System.out.println(hm.containsKey(7));

        //remove operation
        System.out.println(hm.remove(3));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isempty
        System.out.println(hm.isEmpty());
        

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }
} 
