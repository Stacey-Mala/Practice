package practice6.arrayDeque;

import java.util.ArrayDeque;

public class Task1 {
    public static void main(String[] args){
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(-5);
        deque.add(15);
        deque.add(34);
        deque.add(100);
        deque.add(-5);

        System.out.println(deque);
    }
}
