package practice6.linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args){
        Set<String> fruit = new LinkedHashSet<>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("tomato");
        fruit.add("melon");
        fruit.add("lemon");
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("orange");

        StringBuilder sb = new StringBuilder();
        for(String f : fruit) {
            sb.append(f).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
