package practice8.part1;
import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = a -> a % 2 == 0;

        int x = 2;
        int y = 3;

        System.out.println(isEven.test(x));
        System.out.println(isEven.test(y));
    }
}
