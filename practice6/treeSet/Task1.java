package practice6.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args){
        Set<Integer> nums = new TreeSet<>();
        nums.add(-10);
        nums.add(3);
        nums.add(10);
        nums.add(0);
        nums.add(-10);
        System.out.println(nums);
    }
}
