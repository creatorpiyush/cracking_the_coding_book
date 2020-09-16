package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class kthsmallest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int k = s.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[k - 1]);

    }

}
