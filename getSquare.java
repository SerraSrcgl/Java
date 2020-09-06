package Arrays;

public class getSquare {
    public static void main(String [] args){

        for(int i=0;i<5;i++){
            System.out.println(Math.sqrt(i));

        }
        double []numArray={1.4,5.1,7.0,3.2,73.32,9.90} ;
    double largest=numArray[0];
    for(double num:numArray){
        if(largest<num)
            largest=num;
    }
        System.out.println(largest);
    }


}
