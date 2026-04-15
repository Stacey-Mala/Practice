package practice6.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<Integer, String> history = new LinkedHashMap<>();
        for (int i = 1; i <= 100; i++){
            if (history.size() == 10){
                Integer firstPage = history.keySet().iterator().next();
                history.remove(firstPage);
            }
            history.put(i, "page #" + i);
        }
        for (Map.Entry<Integer, String> entry : history.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
