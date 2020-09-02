package Arrays_String;

import java.util.Scanner;

public class substringrotate {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str1 = s.nextLine(), str2 = s.nextLine();

        System.out.println(isrotated(str1, str2));

    }

    public static boolean isrotated(String str1, String str2) {

        if (str1.length() == str2.length() && str1.length() > 0) {
            String strstr = str1 + str1;
            return isSubstring(strstr, str2);
        }

        return false;

    }

    public static boolean isSubstring(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        int counter = 0;
        for (int i = 0; i < s2.length; i++) {
            int start = i;
            while (counter < s2.length && start < s1.length && s1[start++] == s2[counter++]) {
                if (counter == s2.length)
                    return true;
            }
            counter = 0;
        }
        return false;
    }

}