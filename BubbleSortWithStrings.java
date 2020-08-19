package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortWithStrings {
    public static void main(String [] args) {
        Scanner scan=new Scanner(System.in);
        String[] str=new String[4];
        for(int j=0;j< str.length;j++){
            System.out.printf("Enter 4 character to sort with bubble sort %d : ", j + 1);

            if (scan.hasNext()) {
                str[j] = scan.next();
            }

        }
        System.out.println(Arrays.toString(str));
        for (int j = 0; j < str.length; j++) {
            for (int i = j + 1; i < str.length; i++) {
                // comparing strings
                if (str[i].compareTo(str[j]) < 0) {
                  String  temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
            }
            System.out.println(str[j]);
        }
    }
}
