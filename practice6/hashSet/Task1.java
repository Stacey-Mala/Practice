package practice6.hashSet;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(-10);
        numbers.add(7);
        numbers.add(4);
        numbers.add(5);

        for (Integer n : numbers) {
            System.out.println(n);
        }
    }
}
