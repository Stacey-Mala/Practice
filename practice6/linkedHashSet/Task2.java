package practice6.linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<Integer> nums = new LinkedHashSet<>();
        addElement(nums, 5);
        addElement(nums, 5);
        addElement(nums, -1);
        addElement(nums, 2);
        addElement(nums, 3);
        addElement(nums, -1);
        System.out.println(nums);
    }
    public static void addElement(Set<Integer> set, int n) {
        set.add(n);
    }
}
