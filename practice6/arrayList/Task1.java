package practice6.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, 10, -3, 4, 0));
        numbers.add(11);
        for(Integer n : numbers) {
            System.out.print(n + " ");
        }
    }
}
