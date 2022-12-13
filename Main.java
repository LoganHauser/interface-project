import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Create a new arraylist
        ArrayList<SortObject> objectlist = new ArrayList<>();
        //Add 10 different objects to the arraylist
        objectlist.add(new SortObject(5));
        objectlist.add(new SortObject(17));
        objectlist.add(new SortObject(8));
        objectlist.add(new SortObject(11));
        objectlist.add(new SortObject(2));
        objectlist.add(new SortObject(5));
        objectlist.add(new SortObject(8));
        objectlist.add(new SortObject(15));
        objectlist.add(new SortObject(10));
        objectlist.add(new SortObject(20));

        //Print each object before sorting
        System.out.println("Unsorted Objects:");
        for (SortObject sortObject : objectlist) {
            System.out.println(sortObject.value);
        }

        //Sort the arraylist
        Collections.sort(objectlist);

        //Print each object after sorting
        System.out.println("Sorted Objects:");
        for (SortObject sortObject : objectlist) {
            System.out.println(sortObject.value);
        }
    }
}
