package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class findcommonin3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int k = s.nextInt();
        int[] arr1 = new int[k];
        for (int i = 0; i < k; i++) {
            arr1[i] = s.nextInt();
        }

        int m = s.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = s.nextInt();
        }

        int n = s.nextInt();
        int[] arr3 = new int[n];
        for (int i = 0; i < n; i++) {
            arr3[i] = s.nextInt();
        }

        ArrayList<Integer> alist = commonof3(arr1, arr2, arr3);
        for (Integer a : alist) {
            System.out.print(a + " ");
        }
    }

    public static ArrayList<Integer> commonof3(int[] arr1, int[] arr2, int[] arr3) {

        ArrayList<Integer> all = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                all.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
        return all;
    }

}
