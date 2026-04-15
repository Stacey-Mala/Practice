package practice6.linkedList;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Wake up");
        tasks.add("Have breakfast");
        tasks.add("Get dressed");

        while(!tasks.isEmpty()) {
            String task = tasks.poll();
            System.out.println(task);
        }
    }
}
