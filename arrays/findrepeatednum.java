package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class findrepeatednum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        ArrayList<Integer> al = findrepeatednum(arr);

        for (Integer repeated : al) {
            System.out.print(repeated + " ");
        }

    }

    public static ArrayList<Integer> findrepeatednum(int[] arr) {
        ArrayList<Integer> alist = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (alist.contains(arr[i])) {
                        break;
                    } else {
                        alist.add(arr[j]);
                    }
                }
            }
        }
        return alist;
    }

}
