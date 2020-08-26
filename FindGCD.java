package UnderstandingMethods;

import java.util.Scanner;

public class FindGCD {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter 2 number you want to find GCD");
        int num1=scan.nextInt();
        int num2=scan.nextInt();


        while(num1 != num2)
        {
            if(num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }

        System.out.println("G.C.D = " + num1);
    }
}