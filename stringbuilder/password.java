package stringbuilder;

import java.util.Scanner;

public class password {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String str = s.next();

        int lc = 0, uc = 0, no = 0, sc = 0;
        int sum = 0;

        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        char[] input = str.toCharArray();

        int count = 4;
        int ddoss = 6-n;

        boolean num = true;
        boolean l = true;

    }

}
