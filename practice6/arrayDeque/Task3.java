package practice6.arrayDeque;

import java.util.ArrayDeque;

public class Task3 {
    public static void main(String[] args){
        ArrayDeque<String> colors = new ArrayDeque<>();
        colors.addFirst("red");
        colors.addFirst("orange");
        colors.addLast("blue");
        colors.addLast("purple");
        System.out.println("Colors before: " + colors); // orange red blue purple
        System.out.println("First removed: " + colors.removeFirst()); // orange
        System.out.println("Last removed: " + colors.removeLast()); // purple
        System.out.println("Colors after: " + colors); // red blue
    }
}
