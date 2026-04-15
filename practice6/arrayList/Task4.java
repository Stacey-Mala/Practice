package practice6.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(5, 5454, -5454, 75, 666, 0));
        int sum = 0;
        for (Integer n : nums) {
            sum += n;
        }
        System.out.println("Sum: " + sum);
    }
}
