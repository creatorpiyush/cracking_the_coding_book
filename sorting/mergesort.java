package sorting;

import java.util.Scanner;

public class mergesort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int[] sortedarray = mergesort(arr, 0, arr.length - 1);
        for (int sorted : sortedarray) {
            System.out.print(sorted + " ");
        }

    }

    public static int[] mergesort(int[] arr, int low, int high) {
        if (low == high) {
            int[] br = new int[1];
            br[0] = arr[low];
            return br;
        }

        int mid = (low + high) / 2;
        int[] one = mergesort(arr, low, mid);
        int[] two = mergesort(arr, mid + 1, high);
        int[] sorted = merge(one, two);
        return sorted;
    }

    public static int[] merge(int[] one, int[] two) {

        int i = 0, j = 0, k = 0;
        int[] sorted = new int[one.length + two.length];
        while (i < one.length && j < two.length) {
            if (one[i] < two[j]) {
                sorted[k] = one[i];
                i++;
                k++;
            } else {
                sorted[k] = two[j];
                j++;
                k++;
            }
        }

        while (i < one.length) {
            sorted[k] = one[i];
            i++;
            k++;
        }

        while (j < two.length) {
            sorted[k] = two[j];
            j++;
            k++;
        }

        return sorted;
    }

}
