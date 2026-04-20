package practice6.arrayDeque;

import java.util.ArrayDeque;

public class Task2 {
    public static void main(String[] args){
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("Three");
        stack.push("Two");
        stack.push("Four");
        stack.push("One");
        stack.push("Five");

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
