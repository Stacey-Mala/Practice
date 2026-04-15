package practice6.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(5, 45, 54, 787, 0, -66, 4545, 72, 22));
        System.out.println("Even numbers: ");
        for(Integer n : nums) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
    }
}
