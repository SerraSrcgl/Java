package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortComplicated1 {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int num[];
        num=new int[4];
        for(int i=0;i<4;i++){
            System.out.printf("Enter 4 integer %d:",i+1);
            if(scan.hasNextInt()){
                num[i]=scan.nextInt();

            }
        }
        System.out.println(Arrays.toString(num));
        int temp;
        for (int i = 1; i < num.length; i++) {
            for (int j = i; j > 0; j--) {
                if (num[j] < num [j - 1]) {
                    temp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}

