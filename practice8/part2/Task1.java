package practice8.part2;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> words = List.of("computer","window", "lamp", "phone", "photograph");
        List<String> shortWords = words.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println(shortWords);
    }
}
