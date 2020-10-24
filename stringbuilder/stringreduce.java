package stringbuilder;

import java.util.Scanner;

public class stringreduce {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        StringBuilder str = new StringBuilder(s.nextLine());
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                str.delete(i - 1, i + 1);
                i = 0;
            }
        }

        if (str.length() == 0)
            System.out.println("Empty String");
        else
            System.out.println(str);

    }

}
