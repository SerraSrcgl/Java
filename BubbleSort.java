package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num[];
        num = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.printf("Enter 5 integer to sort with bubble sort %d : ", i + 1);

            if (scan.hasNextInt()) {
                num[i] = scan.nextInt();
            }

        }
        System.out.println(Arrays.toString(num));
        for (int i = 0; i <= num.length; i++) {
            for (int j = 1; j <= num.length - 1; j++) {
                if (num[j - 1] > num[j]) {
                    int temp = num[j - 1];
                    num[j - 1] = num[j];
                    num[j] = temp;



                }
            }
        }System.out.println(Arrays.toString(num));

    }

}
