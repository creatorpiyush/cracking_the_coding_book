package arrays;

import java.util.Scanner;

public class findlastindex {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int value = s.nextInt();

        System.out.println(findlastindex(arr, value));

    }

    public static int findlastindex(int[] arr, int value) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

}
