package practice6.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args){
        Map<String, Integer> scores = new TreeMap<>();
        scores.put("Charlie", 85);
        scores.put("Anna", 70);
        scores.put("Ellon", 74);
        scores.put("Bob", 61);
        scores.put("David", 91);

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
