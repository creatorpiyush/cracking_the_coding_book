package searching;

import java.util.Scanner;

public class linearsearch {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int value = s.nextInt();

        System.out.println(linearsearch(arr, value));

    }

    public static int linearsearch(int[] arr, int value) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;

    }

}
