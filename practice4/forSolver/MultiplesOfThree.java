package practice4.forSolver;

public class MultiplesOfThree {
    public static void main(String[] args) {
        System.out.println("--- Multiples of Three ---");
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 100; i++){
            if (i % 3 == 0) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
