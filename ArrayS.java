package Arrays;

import java.util.ArrayList;

public class ArrayS {
    public static void main(String[] args){
        ArrayList<Integer> ArrLis
                = new ArrayList<Integer>();

        // Add elements
        ArrLis.add(32);
        ArrLis.add(67);
        ArrLis.add(98);
        ArrLis.add(100);

        // print ArrayList
        System.out.println("ArrayList: "
                + ArrLis);

        // Get the array of the elements
        // of the ArrayList
        // using toArray() method
        Object[] arr = ArrLis.toArray();

        System.out.println("Elements of ArrayList"
                + " as Array: "
                + Arrays.toString(arr));
    }
}
