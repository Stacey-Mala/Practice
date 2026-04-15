package practice6.hashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Task4 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Stacey");
        names.add("Alex");
        names.add("Andrew");
        names.add("Anna");
        names.add("Victoria");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to check: ");
        String targetName = scanner.nextLine();
        if (names.contains(targetName)) {
            System.out.printf("'%s' is in the set", targetName);
        } else {
            System.out.printf("'%s' is not in the set", targetName);
        }

        scanner.close();
    }
}
