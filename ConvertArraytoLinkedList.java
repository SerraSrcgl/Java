package Genarate;

import java.util.Arrays;
import java.util.LinkedList;

class ConvertArraytoLinkedList {
    public static void main(String[] args) {

        // create an array
        String[] array = {"Serra", "Zeynep", "Zehra"};
        System.out.println("Array: " + Arrays.toString(array));

        // convert array to a linked list
        LinkedList<String> languages= new LinkedList<>(Arrays.asList(array));

        System.out.println("LinkedList: " + languages);
    }
}