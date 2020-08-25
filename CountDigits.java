package UnderstandingMethods;

import java.util.Scanner;

public class CountDigits {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter an integer");
        int number1=scanner.nextInt();

        int count =0;
while (number1!=0) {
    number1 /= 10;
    count++;
}
        System.out.println("There are "+count+" digits");
    }
}
