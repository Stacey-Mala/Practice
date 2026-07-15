package practice8.part4;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> words = List.of("computer","window", "lamp", "phone", "photograph");
        Map<Character, List<String>> groups = words.stream()
                .collect(Collectors.groupingBy(
                        s -> s.charAt(0),
                        LinkedHashMap::new,
                        Collectors.toList()
                ));
        System.out.println(groups);
    }
}
