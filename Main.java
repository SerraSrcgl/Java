import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name and surname");
        String name=scan.next();
        String surname=scan.next();
        int namelength=name.length();
        while(namelength%12!=0){
            name=name+"*";
            namelength=name.length();
        }
        int surnamelength=surname.length();
        while (surnamelength%12!=0){
            surname=surname+"+";
            surnamelength=surname.length();

        }
        int namepartlenght=name.length()/4;//use location info
        int numnamespace=namelength-2;
        String namaspace="";
        while (namaspace.length()<numnamespace) {
            namaspace = namaspace + "";

        }
        String namePart1=name.substring(0,namepartlenght);
        String namePart2=name.substring(namepartlenght, 2*namepartlenght);
        String namePart3=name.substring(2*namepartlenght,3*namepartlenght);
        String namePart4=name.substring(3*namepartlenght,4*namepartlenght);
        System.out.println(namePart1);
        System.out.println(namePart2);
        System.out.println(namePart3);
        System.out.println(namePart4);
int k=0;
while(k<namepartlenght){
    int l=namepartlenght-1-k;
    System.out.println(namePart1.substring(k,k+1)+namaspace);
    k=k+1;

}

int surnamepartlength=surname.length()/4;
int numsurnamespace=surnamelength-2;
String surnamespace="";
while(surnamespace.length()<numsurnamespace){
    surnamespace=surnamespace+"";


}



    }}
