package UnderstandingMethods;

import java.util.Scanner;

public class CalculateSumOfNaturalNumbers {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the limits for sum");
        int number = scan.nextInt();
        int sum = 0;


        for(int i = 1; i <= number; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}