package practice6.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Double> menu = new LinkedHashMap<>();
        menu.put("sandwich", 1.5);
        menu.put("cola", 0.7);
        menu.put("soup", 2.0);
        menu.put("spaghetti", 2.1);
        menu.put("water", 0.5);

        System.out.println("--- Menu ---");
        for(Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.printf("%s costs %.2f$\n", entry.getKey(), entry.getValue());
        }
    }
}
