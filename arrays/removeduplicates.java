package arrays;

import java.util.Scanner;

public class removeduplicates {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int[] arrrem = removeduplicates(arr);
        for (int arrr : arrrem) {
            System.out.print(arrr + " ");
        }
    }

    public static int[] removeduplicates(int[] arr) {
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
