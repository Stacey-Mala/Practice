package practice6.linkedList;

import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(w).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
