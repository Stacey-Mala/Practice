package practice6.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Ann", "123-321-123");
        phoneBook.put("Bob", "123-456-789");
        phoneBook.put("Charlie", "987-654-321");
        phoneBook.put("David", "111-222-333");
        phoneBook.put("Ethan", "555-666-777");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter contact's name to call: ");
        String name = input.nextLine();
        if (phoneBook.containsKey(name)) {
            System.out.println(name + "' phone number is " + phoneBook.get(name));
        } else {
            System.out.println("Contact was not found");
        }

        input.close();
    }
}
