package practice6.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.print("Enter a word (q for quit): ");
            input = scanner.nextLine();
            if (!"q".equalsIgnoreCase(input)){
                words.add(input);
            }
        } while (!"q".equalsIgnoreCase(input));
        String longest = "";
        for (String w : words) {
            if (longest.length() < w.length()) {
                longest = w;
            }
        }
        System.out.printf("The longest word is '%s'\n", longest);
        scanner.close();
    }
}
