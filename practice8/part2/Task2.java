package practice8.part2;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(3, -10, 11, 15, -50, 55);
        List<Integer> numsDivisibleByFive = nums.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(numsDivisibleByFive);
    }
}
