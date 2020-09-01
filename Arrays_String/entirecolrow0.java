package Arrays_String;

import java.util.Scanner;

/**
 * entirecolrow0
 */
public class entirecolrow0 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int m = s.nextInt();
        int n = s.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        setzeros(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void setzeros(int[][] arr) {
        boolean[] row = new boolean[arr.length];
        boolean[] column = new boolean[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        // * nullify row and column
        for (int i = 0; i < row.length; i++) {
            if (row[i])
                nullifyrow(arr, i);
        }

        for (int j = 0; j < column.length; j++) {
            if (column[j])
                nullifycolumn(arr, j);
        }
    }

    public static void nullifyrow(int[][] arr, int row) {
        for (int j = 0; j < arr[0].length; j++) {
            arr[row][j] = 0;
        }
    }

    public static void nullifycolumn(int[][] arr, int col) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][col] = 0;
        }
    }

}