package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class add2listreverse {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        LinkedList<Integer> ll1 = new LinkedList<>();

        for (int i = 2; i >= 0; i--) {
            int l1 = s.nextInt();
            ll1.add(l1);
        }

        LinkedList<Integer> ll2 = new LinkedList<>();

        for (int i = 2; i >= 0; i--) {
            int l2 = s.nextInt();
            ll2.add(l2);
        }

        int sum = 0;
        int num = 0;
        int power = 0;
        for (int i = 0; i < 3; i++) {
            num += ll1.get(i) * Math.pow(10, power);
            power++;
        }
        // System.out.println(num);
        sum += num;
        num = 0;
        power = 0;

        for (int i = 0; i < 3; i++) {
            num += ll2.get(i) * Math.pow(10, power);
            power++;
        }

        sum += num;

        // System.out.println(sum);

        LinkedList<Integer> fll = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            int a = 0;
            a = sum % 10;
            fll.add(a);
            sum /= 10;
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(fll.get(i) + " ");
        }
    }

}
