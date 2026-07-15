package practice8.part4;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(55454, -44, 454, -486, 0, 555);
        Map<Boolean, List<Integer>> parityGroup = nums.stream()
                .collect(Collectors.groupingBy(
                        n -> n % 2 == 0,
                        LinkedHashMap::new,
                        Collectors.toList()
                ));
        System.out.println(parityGroup);
    }
}
