package Genarate;

import java.util.Scanner;

public class FindChar {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word. Dont forget to write a word suitable for your needs");
        String word=scan.next();
        System.out.println("Original string="+word);
        int index1=word.charAt(3);
        int index2=word.charAt(9);
        System.out.println("Index 3 of my word is"+index1);
        System.out.println("Index 9 of my word is"+index2);
    }

}
