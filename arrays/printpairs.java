package arrays;

import java.util.Scanner;

public class printpairs {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int sum = s.nextInt();

        System.out.println(printpairs(arr, sum));

    }

    public static int printpairs(int arr[], int sum) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    count++;
                }
            }
        }
        return count;
    }

}
