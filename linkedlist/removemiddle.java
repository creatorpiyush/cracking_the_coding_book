package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class removemiddle {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        LinkedList<Integer> ll = new LinkedList<>();

        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int val = s.nextInt();
            ll.add(val);
        }

        int mid = ll.size() / 2;
        ll.remove(mid);
        for (Integer list : ll) {
            System.out.print(list + " ->");
        }

    }

}
