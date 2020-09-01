package Arrays_String;

import java.util.Scanner;

/**
 * uniquestrchat
 */
public class uniquestrchat {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        System.out.println(uniquecheck(str));

    }

    public static boolean uniquecheck(String str) {

        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    return false;
                } else {
                    continue;
                }
            }
        }
        return true;

    }
}