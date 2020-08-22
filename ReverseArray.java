package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("Enter 6 integer to array : ");
        for (int i = 0; i < arr.length; i++) {


            if (scan.hasNextInt()) {
                arr[i] = scan.nextInt();
            }
        }
        System.out.println("Array before reversed" + Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;

            }
            System.out.println("New reversed array" + Arrays.toString(arr));

        }
    }
