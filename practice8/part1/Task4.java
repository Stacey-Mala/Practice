package practice8.part1;

import java.util.function.Function;

public class Task4 {
    public static void main(String[] args) {
        Function<String, Integer> lengthChecker = s -> s.length();

        String word1 = "computer";
        String word2 = "mouse";

        System.out.println(lengthChecker.apply(word1));
        System.out.println(lengthChecker.apply(word2));
    }
}
