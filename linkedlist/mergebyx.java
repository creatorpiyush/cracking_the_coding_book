package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class mergebyx {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        LinkedList<Integer> ll = new LinkedList<>();

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int val = s.nextInt();
            ll.add(val);
        }

        int x = s.nextInt();

        LinkedList<Integer> nll = new LinkedList<>();

        for (Integer fnll : ll) {
            if (fnll < x) {
                nll.add(fnll);
            }
        }

        for (Integer fnll : ll) {
            if (fnll == x) {
                nll.add(fnll);
            }
        }

        for (Integer fnll : ll) {
            if (fnll > x) {
                nll.add(fnll);
            }
        }

        for (Integer fll : nll) {
            System.out.print(fll + " ");
        }

    }

}
