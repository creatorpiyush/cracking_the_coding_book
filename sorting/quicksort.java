package sorting;

import java.util.Scanner;

public class quicksort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        quicksort(arr, 0, arr.length - 1);
        for (int arrele : arr) {
            System.out.print(arrele + " ");
        }

    }

    public static void quicksort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pindex = partition(arr, start, end);
        quicksort(arr, start, pindex - 1);
        quicksort(arr, pindex + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pindex = start;
        int pivot = arr[end];
        for (int i = start; i < end - 1; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, pindex);
                pindex++;
            }
        }
        swap(arr, pindex, end);
        return pindex;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
