package practice8.part3;

import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(3, -10, 11, 15, -50, 55);
        Boolean hasEven = nums.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println(hasEven);
    }
}