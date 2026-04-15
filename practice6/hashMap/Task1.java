package practice6.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Anna", 25);
        map.put("Bob", 15);
        map.put("Sandy", 16);
        map.put("Andrew", 12);
        map.put("Charlie", 70);

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
