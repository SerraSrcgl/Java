public class Calculating{
public static void main(String []args){
int a=9;
int b=6;
int delta;
boolean busy=true;
int c =a*b;
System.out.println("Multiplication of a and b"+c);
System.out.println(Math.sqrt(a));
delta=(b*b)-4*a*c;
if(!busy){
System.out.println("I am free");
}else{
System.out.println("I am busy");
}
}
