package UnderstandingMethods;

import java.util.Scanner;

public class DecimalComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one  double number");
        double number1 = scan.nextDouble();
        System.out.println("Again double please");
        double number2 = scan.nextDouble();


        if (areEqualByThreeDecimalPlaces(number1, number2))
            System.out.println("Two numbers are same up to three decimal places.");
        else
            System.out.println("Two numbers are not same up to three decimal places.");


        if (areEqual(number1, number2))
            System.out.println("Two numbers are same up to three decimal places.");
        else
            System.out.println("Two numbers are not same up to three decimal places.");

    }


    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        number1 *= 1000;
        number2 *= 1000;

        int firstNumber = (int) number1;
        int secondNumber = (int) number2;

        if (firstNumber != secondNumber)
            return false;
        else
            return true;

    }

    public static boolean areEqual(double number1, double number2) {
        number1 /= 1000;
        number2 /= 1000;
        int firstNumber = (int) number1;
        int secondNumber = (int) number2;

        if (firstNumber != secondNumber)
            return false;
        else
            return true;


    }
}

//credits to-> YouTube @Samedify










