package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class kvalueinll {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        LinkedList<Integer> ll = new LinkedList<>();

        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int llval = s.nextInt();
            ll.add(llval);
        }

        int k = s.nextInt();

        for (int i = k; i < n; i++) {
            System.out.print(ll.get(i) + " ");
        }

    }

}
