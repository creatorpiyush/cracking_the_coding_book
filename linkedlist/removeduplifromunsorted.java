package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class removeduplifromunsorted {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        LinkedList<Integer> ll = new LinkedList<>();

        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int val = s.nextInt();
            ll.add(val);
        }

        LinkedList<Integer> lists = removeduplicate(ll);
        for (Integer list : lists) {
            System.out.print(list + " ");
        }

    }

    public static LinkedList<Integer> removeduplicate(LinkedList<Integer> ll) {

        for (int i = 0; i < ll.size() - 1; i++) {
            for (int j = i + 1; j < ll.size(); j++) {
                if (ll.get(i) == ll.get(j)) {
                    ll.remove(j);
                }
            }
        }
        return ll;
    }

}
