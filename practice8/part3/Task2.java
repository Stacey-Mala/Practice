package practice8.part3;

import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(3, -10, 11, 15, -50, 55);
        Integer minimum = nums.stream()
                .min(Comparator.naturalOrder())
                .orElseThrow();

        System.out.println(minimum);
    }
}
