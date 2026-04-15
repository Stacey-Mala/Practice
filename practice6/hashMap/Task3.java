package practice6.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Anna", 25);
        ages.put("Bob", 15);
        ages.put("Sandy", 16);
        ages.put("Andrew", 12);
        ages.put("Charlie", 70);

        int target = 18;
        checkAge(ages, target);
    }
    public static void checkAge(Map<String, Integer> map, int target) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < target) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
