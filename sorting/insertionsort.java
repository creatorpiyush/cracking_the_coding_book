package sorting;

import java.util.Scanner;

public class insertionsort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int[] arrelements = insertionsort(arr);
        for (int arrele : arrelements) {
            System.out.print(arrele + " ");
        }

    }

    public static int[] insertionsort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {

                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

            }
        }

        return arr;

    }

}
