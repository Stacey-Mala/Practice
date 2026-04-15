package practice6.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Task5 {
    public static void main(String[] args) {
        List<String> things = new LinkedList<>();

        things.add("guitar");
        things.add("computer");
        things.add("micro");
        things.add("orange");

        ListIterator<String> iterator = things.listIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
