package practice8.part3;

import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> words = List.of("авто", "Бобр", "Компьютер", "Барабан", "белка", "велосипед");
        String firstWord = words.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst()
                .orElse("There is no words starting with 'Б'");
        System.out.println(firstWord);
    }
}
