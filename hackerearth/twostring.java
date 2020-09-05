package hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class twostring {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        while (n != 0) {
            String str1 = s.next();
            String str2 = s.next();

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            str1 = new String(arr1);
            str2 = new String(arr2);

            if (str1.equals(str2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            n--;
        }

    }

}
