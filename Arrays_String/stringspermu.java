package Arrays_String;

import java.util.Arrays;
import java.util.Scanner;

/**
 * stringspermu
 */
public class stringspermu {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();

        System.out.println(stringpermucheck(str1, str2));

    }

    public static boolean stringpermucheck(String str1, String str2) {

        int m = str1.length();
        int n = str2.length();

        if (m != n)
            return false;

        char[] str1arr = str1.toCharArray();
        char[] str2arr = str2.toCharArray();

        Arrays.sort(str1arr);
        Arrays.sort(str2arr);

        for (int i = 0; i < m; i++) {
            if (str1arr[i] != str2arr[i])
                return false;
        }
        return true;

    }

}