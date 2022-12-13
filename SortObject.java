public class SortObject implements Comparable<SortObject> {
    //Int value that is used to sort the object
    public int value;

    //Constructor that accepts an int value
    public SortObject(int value) {
        this.value = value; //Set the object's value to the given value
    }

    //Override the compareTo method from the Comparable interface
    @Override
    public int compareTo(SortObject o) {
        if (value > o.value) {
            return 1; //If this object's value is greater, return 1
        }
        if (value < o.value) {
            return -1; //If this object's value is smaller, return -1
        }
        return 0; //Otherwise, the values are the same and 0 is returned
    }
}
