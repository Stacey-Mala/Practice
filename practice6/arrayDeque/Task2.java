package practice6.arrayDeque;

import java.util.ArrayDeque;

public class Task2 {
    public static void main(String[] args){
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.add("Three");
        stack.add("Two");
        stack.add("Four");
        stack.add("One");
        stack.add("Five");

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
