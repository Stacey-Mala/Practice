package practice7.generics;

public class GenericClassWithTwoParamsTask {
    public static void main(String[] args) {
        Pair<String, Integer> date = new Pair<>("May", 2);

        System.out.println("Today is the " + date.getSecond() + "nd of " + date.getFirst());

        date.setFirst("August");
        date.setSecond(12);

        System.out.println("My birthday is on the " + date.getSecond() + "th of " + date.getFirst());
    }
}
