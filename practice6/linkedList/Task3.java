package practice6.linkedList;

import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();

        words.add("Spring");
        words.add("Summer");
        words.add("The Fall");

        System.out.println("First word: " + words.getFirst());
        System.out.println("Last word: " + words.getLast());
    }
}
