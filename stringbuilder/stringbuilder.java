package stringbuilder;

import java.util.Scanner;

public class stringbuilder {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        StringBuilder str1 = new StringBuilder();

        str1.append("ABC");
        System.out.println(str1);

        str1.insert(0, "The ");
        System.out.println(str1);

        str1.replace(3, 5, "hi");
        System.out.println(str1);

        System.out.println(str1.length());

        System.out.println(str1.substring(3));

        System.out.println(str1.substring(3, 6));

        str1.delete(2, 6);
        System.out.println(str1);

    }

}
