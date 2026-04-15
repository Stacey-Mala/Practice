package practice6.priorityQueue;

import java.util.PriorityQueue;

public class Task1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(25);
        queue.add(5);
        queue.add(15);
        queue.add(5);
        queue.add(-5);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
