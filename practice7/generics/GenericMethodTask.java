package practice7.generics;

public class GenericMethodTask {
    public static void main(String[] args) {
        String[] months = {"June", "July", "August"};
        Integer[] numbers = {6, 7, 8};

        printArray(months);
        printArray(numbers);

    }
    public static <T> void printArray(T[] array) {
        for (T a : array) {
            System.out.println(a);
        }
    }
}
