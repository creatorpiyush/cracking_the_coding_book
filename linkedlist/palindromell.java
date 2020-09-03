package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class palindromell {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        LinkedList<Integer> ll = new LinkedList<>();

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int val = s.nextInt();
            ll.add(val);

        }

        boolean flag = false;
        for (int i = 0; i <= n / 2; i++) {

            if (ll.get(i) == ll.get(n - i - 1)) {
                flag = true;
            } else {
                flag = false;
                break;
            }

        }

        System.out.println(flag);

        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }

}
