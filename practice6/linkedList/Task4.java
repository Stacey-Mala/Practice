package practice6.linkedList;

import java.util.LinkedList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> nums = new LinkedList<>(List.of(5, 10, 10, -45454, 82, 10000));
        nums.add(100);
        int sum = 0;
        for (Integer n : nums) {
            sum += n;
        }
        System.out.println("Sum: " + sum);
    }
}
