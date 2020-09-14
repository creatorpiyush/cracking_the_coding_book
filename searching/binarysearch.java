package searching;

import java.util.Scanner;

public class binarysearch {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int value = s.nextInt();

        System.out.println(binarysearch(arr, value));

    }

    public static int binarysearch(int[] arr, int value) {
        int beg = 0, end = arr.length - 1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }

        return -1;

    }

}
