package arrays;

import java.util.Scanner;

public class alternatepositiveandnegative {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int[] arrelements = alternatepositiveandnegative(arr);
        for (int arrele : arrelements) {
            System.out.print(arrele + " ");
        }

    }

    public static int[] alternatepositiveandnegative(int[] arr) {
        int i = -1, temp = 0;
        int n = arr.length;
        for (int j = 0; j < n; j++) {
            if (arr[j] < 0) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int pos = i + 1, neg = 0;
        while (pos < n && neg < pos && arr[neg] < 0) {
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg += 2;
        }
        return arr;
    }

}
