package hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class maxstringchar {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        HashMap<Character, Integer> map = new HashMap<>();

        String str = s.next();

        maxstrchar(map, str);

    }

    public static void maxstrchar(HashMap<Character, Integer> map, String str) {

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), (map.get(str.charAt(i)) + 1));
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        int max = Integer.MIN_VALUE;
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            max = Math.max(max, entry.getValue());
        }

        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
                return;
            }
        }

    }

}
