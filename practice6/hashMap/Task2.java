package practice6.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<>();
        data.put("Anna", 25);
        data.put("Bob", 15);
        data.put("Sandy", 16);
        data.put("Andrew", 12);
        data.put("Charlie", 70);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name to search: ");
        String name = scanner.nextLine();
        if (data.containsKey(name)) {
            System.out.println(name + " was found");
        } else {
            System.out.println(name + " was not found");
        }

        scanner.close();
    }
}
