package Arrays_String;

import java.util.Scanner;

public class charreplacecount {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        System.out.println(charreplace(str));

    }

    public static String charreplace(String str) {
 
        StringBuffer sb = new StringBuffer();
        int count = 1;
        char prev = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (prev == curr) {
                count++;
            } else {
                sb.append(prev);
                sb.append(count);
                prev = curr;
                count = 1;
            }
        }
        sb.append(prev); // * these both sb are for last append 
        sb.append(count);
        if (str.length() < sb.length()) {
            return str;
        } else {
            return sb.toString();
        }

    }

}