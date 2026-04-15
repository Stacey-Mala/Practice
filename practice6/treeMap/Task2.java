package practice6.treeMap;

import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args){
        TreeMap<Double, String> prices = new TreeMap<>();
        prices.put(30.0, "Darts");
        prices.put(44.5, "Microphone");
        prices.put(1500.0, "Laptop");
        prices.put(0.5, "Pen");
        prices.put(10.0, "Notebook");

        System.out.println("Cheapest thing: " + prices.firstKey());
        System.out.println("Most expensive thing: " + prices.lastKey());
    }
}
