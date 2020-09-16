package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class union {

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

        ArrayList<Integer> list = union(arr1, arr2);
        for (Integer le : list) {
            System.out.print(le + " ");
        }

    }

    public static ArrayList<Integer> union(int[] arr1, int[] arr2) {

        ArrayList<Integer> arrlist = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (arrlist.contains(arr1[i])) {
                break;
            } else {
                arrlist.add(arr1[i]);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arrlist.contains(arr2[i])) {
                break;
            } else {
                arrlist.add(arr2[i]);
            }
        }
        return arrlist;
    }

}
