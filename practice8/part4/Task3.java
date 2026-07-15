package practice8.part4;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbs = List.of(55454, -44, 454, -486, 0, 555);
        Double average = numbs.stream()
                .collect(Collectors.averagingDouble(n -> n));
        System.out.println(average);
    }
}
