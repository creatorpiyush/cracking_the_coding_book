package Arrays_String;

import java.util.Scanner;

public class imagerotate {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        rotate(arr);

    }

    public static void rotate(int[][] arr) {

        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int first = i;
            int last = n - 1 - i;
            for (int j = first; j < last; j++) {
                int offset = j - first;
                int top = arr[first][j];
                arr[first][j] = arr[last - offset][first];
                arr[last - offset][first] = arr[last][last - offset];
                arr[last][last - offset] = arr[j][last];
                arr[j][last] = top;
            }

        }

        System.out.println("**** 90deg rotate ****");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}