package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class firstnonrepeating {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(firstnonrepeating(arr));

    }

    public static ArrayList<Integer> firstnonrepeating(int[] arr) {
        ArrayList<Integer> all = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    all.add(arr[j]);
                }
            }
        }

        return null;
    }
}
