package practice6.treeMap;

import java.util.TreeMap;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        TreeMap<Integer, String> employees = new TreeMap<>();
        employees.put(505, "David");
        employees.put(123, "Anna");
        employees.put(876, "Mike");
        employees.put(777, "Lisa");
        employees.put(167, "Tom");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ID: ");
        String input = scanner.nextLine();
        try {
            int targetId = Integer.parseInt(input);
            Integer higherId = employees.higherKey(targetId);

            if (higherId != null) {
                System.out.println("Higher ID: " + higherId + ", employee: " + employees.get(higherId));
            } else {
                System.out.println("There is no employee with higher ID");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}
