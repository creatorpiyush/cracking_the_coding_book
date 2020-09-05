package hackerearth;

import java.util.Scanner;

public class amovement {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int divnum = 5;
        int steps = num / divnum;
        if (num % 5 == 0) {
            System.out.println(steps);
        } else {
            System.out.println(steps + 1);
        }
    }

}
