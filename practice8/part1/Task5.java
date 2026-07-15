package practice8.part1;

import java.util.function.Consumer;

public class Task5 {
    public static void main(String[] args) {
        Consumer<String> printer = s -> System.out.println(s);

        printer.accept("nobugs");
    }
}
