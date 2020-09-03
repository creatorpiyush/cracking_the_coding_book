import java.util.Scanner;

public class reverseno {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int reverse = 0;
        int tenpower = 0;
        while (n != 0) {
            int dec = n % 10;
            reverse = reverse * 10 + dec;
            n /= 10;
        }

        System.out.println(reverse);

    }

}
