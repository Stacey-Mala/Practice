package practice8.part2;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> elements = List.of("computer","window", "phone", "lamp", "phone", "window", "photograph");
        List<String> unique = elements.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);
    }
}
