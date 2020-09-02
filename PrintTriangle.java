package Arrays;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of the rows");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {//it is loop for rows
            for (int j = rows; j >= i; j--) {
                System.out.print("");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
