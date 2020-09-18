package arrays;

import java.util.Scanner;

public class reversearray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int[] arrreversed = reversearray(arr);
        for (int reversed : arrreversed) {
            System.out.print(reversed + " ");
        }

    }

    public static int[] reversearray(int[] arr) {
        int n = arr.length;
        int[] arr2 = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr2[n - 1] = arr[i];
            n = n - 1;
        }

        return arr2;
    }

}
