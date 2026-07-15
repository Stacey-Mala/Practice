package practice8.part3;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(3, -10, 11, 15, -50, 55);
        int sum = nums.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}
