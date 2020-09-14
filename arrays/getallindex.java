package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class getallindex {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int value = s.nextInt();

        ArrayList getall = getallindex(arr, value);

        if (getall == null) {
            System.out.println("Value not found...");
        } else {
            for (Object get : getall) {
                System.out.print(get + " ");
            }
        }
    }

    public static ArrayList<Integer> getallindex(int[] arr, int value) {

        ArrayList<Integer> getall = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                getall.add(i);
            }
        }

        if (getall.size() != 0) {
            return getall;
        }

        return null;
    }

}
