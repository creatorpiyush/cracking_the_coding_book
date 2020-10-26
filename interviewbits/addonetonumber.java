package interviewbits;

import java.util.ArrayList;
import java.util.Scanner;

public class addonetonumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        ArrayList<Integer> A = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            A.add(s.nextInt());
        }

        double power = 0;
        long sum = 1l;
        for (int i = A.size() - 1; i >= 0; i--) {
            sum += A.get(i) * (Math.pow(10, power));
            power++;
        }

        System.out.println(A);
        System.out.println(sum);

        A.clear();

        String strsum = Long.toString(sum);

        for (int i = 0; i < strsum.length(); i++) {
            A.add(Character.getNumericValue(strsum.charAt(i)));
        }

        System.out.println(A);

    }

}
