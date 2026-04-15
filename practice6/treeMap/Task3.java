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
        try{
            int targetID = Integer.parseInt(input);
            System.out.println("Nearest largest ID: " + employees.higherKey(targetID));
        } catch(NumberFormatException e) {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}
