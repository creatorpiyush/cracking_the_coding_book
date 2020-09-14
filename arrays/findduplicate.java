package arrays;

import java.util.Scanner;

public class findduplicate {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // System.out.println(isDuplicate(arr));

        int[] arrreplaced = replacewith0(arr);
        for (int arrreplace : arrreplaced) {
            System.out.print(arrreplace + " ");
        }

    }

    // public static boolean isDuplicate(int[] arr) {

    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length - i; j++) {
    // if (arr[i] == arr[j]) {
    // return true;
    // }
    // }
    // }

    // return false;

    // }

    public static int[] replacewith0(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }
        return arr;
    }

}
