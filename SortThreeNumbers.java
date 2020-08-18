package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[];
        num = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter integer %d: ", i + 1);
            if (scanner.hasNextInt()) {
                num[i] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);

        System.out.println(Arrays.toString(num));

    }

}
