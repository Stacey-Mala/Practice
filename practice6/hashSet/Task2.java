package practice6.hashSet;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i <= 10; i++) {
            nums.add(i * 4);
        }

        int x = 12;

        if (nums.contains(x)) {
            System.out.println("Set contains " + x);
        } else {
            System.out.println("Set does not contain " + x);
        }
    }
}
