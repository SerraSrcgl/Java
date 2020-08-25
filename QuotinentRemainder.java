package UnderstandingMethods;

import java.util.Scanner;

public class QuotinentRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integer");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        int quotient = number1 / number2;
        int reamainder = number1 % number2;

        System.out.println("quotient="+quotient);
        System.out.println("remainder="+reamainder);
    }

}