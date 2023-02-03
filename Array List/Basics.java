import java.util.ArrayList;

public class Basics {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //Get Elements(Index of a given number)
        int elements = list.get(2);
        System.out.println("Element at index is: "+elements);

        //Remove element from arraylist
        list.remove(2);
        System.out.println("New array is:");
        System.out.println(list);

        //Set element at index
        list.set(2, 8);
        System.out.println("New aray list");
        System.out.println(list);

        //Contains methode
        System.out.println(list.contains(1));

        //Adding new element at a certain index
        list.add(1, 10);
        System.out.println(list);


    }
}
