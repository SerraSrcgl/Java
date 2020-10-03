import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int map[][] = {{1, 1, 0, 0, 0}, {0, 1, 1, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 1, 1}};
        String way = findWay(map);
        System.out.println(way);
    }

    public static String findWay(int[][] data) {
        String result = "";
        int row = data.length;
        int column = data[0].length;//importante

        int i = 0;
        while (i < row) {
            int j = 0;
            while (j < column) {
                if (data[i][j] == 1) {
                    result = result + " " + i + j;

                }

                j = j + 1;
            }
            i = i + 1;
        }
        return result;
    }

}