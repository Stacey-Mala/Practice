package practice8.part2;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> words = List.of("computer","window", "lamp", "phone", "photograph");
        List<Integer> wordsLength = words.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(wordsLength);
    }
}
