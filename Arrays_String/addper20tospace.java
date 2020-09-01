package Arrays_String;

import java.util.Scanner;

public class addper20tospace {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(string20(str));

    }

    public static String string20(String str) {

        return str.replace(" ", "%20").replace("\t", "").replace(",", "\n");

    }

}