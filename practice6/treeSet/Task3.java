package practice6.treeSet;

import java.util.TreeSet;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(50);
        nums.add(10);
        nums.add(30);
        nums.add(40);
        nums.add(20);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target number: ");
        String input = scanner.nextLine();
        try {
            int target = Integer.parseInt(input);
            Integer lower = nums.lower(target);
            Integer higher = nums.higher(target);
            System.out.println("Target: " + target);
            System.out.println("Nearest small number: " + lower);
            System.out.println("Nearest bigger number: " + higher);
        } catch (NumberFormatException e) {
            System.out.printf("'%s' is not a valid number", input);
        }

        scanner.close();
    }
}
