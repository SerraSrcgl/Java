import java.util.Random;
import java.util.Scanner;

public class mineField {
    public static int[][] fillMap(int row, int column) {
        Random rnd = new Random();
        int[][] matris = new int[row][column];
        int i = 0;
        while (i < row) {
            int j = 0;
            while (j < column) {
                matris[i][j] = rnd.nextInt(2);
                j = j + 1;

            }
            i = i + 1;
        }
        for (int k = 0; k < row; k++) {
            for (int l = 0; l < column; l++) {
                System.out.print(matris[k][l] + " ");
                System.out.println();
            }
            return matris;
        }
    }


    public static void main(String [] args){
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter the number of rows");
int a=keyboard.nextInt();
        System.out.println("Please enter the number of columns");
        int b=keyboard.nextInt();
        int [][] MatrisGame=fillMap(a,b) ;
        int mark=0;
        boolean control=true;
        while(control){
            System.out.println("Enter the value of the row");
            int x=keyboard.nextInt();
            System.out.println("Enter the value of the column");
            int y=keyboard.nextInt();
            if(MatrisGame[x][y]==1){
                control=false;
            }else{
                mark=mark+10;
                System.out.println("You are still alive Go on");

            }
        }
        System.out.println("Game is over "+ mark);

    }
}
