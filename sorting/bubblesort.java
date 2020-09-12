package sorting;

import java.util.Scanner;

public class bubblesort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int[] arroutput = bubble_sort(arr);
        for (int arrout : arroutput) {
            System.out.print(arrout + " ");
        }

    }

    public static int[] bubble_sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
