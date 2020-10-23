package hashmaps;

import java.util.HashMap;
import java.util.Scanner;

/**
 * hashmap
 */
public class hashmap {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 10);
        map.put("Russia", 20);
        map.put("USA", 30);
        map.put("China", 1);
        map.put("Aus", 12);

        System.out.println(map);

        System.out.println(map.get("India"));
        System.out.println(map.get("USA"));

        System.out.println(map.remove("Aus"));

        System.out.println(map);

        System.out.println(map.containsKey("Russia"));
        System.out.println(map.containsKey("UAE"));

        Scanner s = new Scanner(System.in);
        boolean choice = s.nextBoolean();
        String str = s.next();
        if (choice) {
            map.put(str, 50);
        }

        System.out.println(map);

    }

}