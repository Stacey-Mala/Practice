package practice6.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of(
                "pen",
                "notebook",
                "cup",
                "orange",
                "micro",
                "pen",
                "notebook")
        );
        Set<String> uniqueWords = ignoreDuplicates(words);
        StringBuilder sb = new StringBuilder();
        for (String w : uniqueWords) {
            sb.append(w).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
    public static Set<String> ignoreDuplicates(List<String> list) {
        return new HashSet<>(list);
    }
}
