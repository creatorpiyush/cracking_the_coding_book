package arrays;

import java.util.HashSet;
import java.util.Scanner;

public class lengthoflongestconsecutive {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(lengthoflongestconsecutive(arr));

    }

    public static int lengthoflongestconsecutive(int[] arr) {
        HashSet<Integer> hset = new HashSet<>();
        for (int ar : arr) {
            hset.add(ar);
        }

        int longest_length = 0;

        for (int ar : arr) {
            int length = 1;
            for (int i = ar - 1; hset.contains(i); i--) {
                hset.remove(i);
                length++;
            }
            for (int i = ar + 1; hset.contains(i); i++) {
                hset.remove(i);
                length++;
            }

            longest_length = Math.max(longest_length, length);
        }

        return longest_length;

    }

}
