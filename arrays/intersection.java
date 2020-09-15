package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class intersection {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int m = s.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }

        int n = s.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = s.nextInt();
        }

        ArrayList<Integer> list = intersection(arr1, arr2);
        for (Integer al : list) {
            System.out.print(al + " ");
        }

    }

    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> alist = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    if (alist.contains(arr2[j])) {
                        break;
                    } else {
                        alist.add(arr2[j]);
                    }
                }
            }
        }
        return alist;
    }

}
