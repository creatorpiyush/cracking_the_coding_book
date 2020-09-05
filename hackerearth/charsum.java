package hackerearth;

import java.util.Scanner;

/**
 * charsum
 */
public class charsum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int ch = (int) str.charAt(i) - 96;
            sum += ch;
        }

        System.out.println(sum);

    }

}