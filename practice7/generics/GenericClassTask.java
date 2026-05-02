package practice7.generics;

public class GenericClassTask {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("May");

        Box<Integer> integerBox = new Box<>();
        integerBox.set(2);

        System.out.println("Today is the " + integerBox.get() + "nd of " + stringBox.get());
    }
}
