package practice6.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args){
        Set<Integer> nums = new TreeSet<>();
        addElement(nums, -5);
        addElement(nums, 1);
        addElement(nums, -10);
        addElement(nums, -100);
        addElement(nums, 10);
        addElement(nums, -10);
        addElement(nums, 1);
        System.out.println(nums); // [-100, -10, -5, 1, 10]
    }
    public static void addElement(Set<Integer> set, int n) {
        set.add(n);
    }
}
