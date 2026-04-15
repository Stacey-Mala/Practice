package practice6.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(5, 10, 45, 65, 100, -454));
        int max = Collections.max(nums);
        System.out.println(max);
    }
}
