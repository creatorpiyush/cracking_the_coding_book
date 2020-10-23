package hashmaps;

import java.util.HashMap;
import java.util.Scanner;

public class countingwordsinstr {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        HashMap<Character, Integer> map = new HashMap<>();

        String str = s.next();

        for (int i = 0; i < str.length(); i++) {

            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), (map.get(str.charAt(i)) + 1));
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        System.out.println(map);
    }

}
