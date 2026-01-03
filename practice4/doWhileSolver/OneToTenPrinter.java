package practice4.doWhileSolver;

public class OneToTenPrinter {
    public static void main(String[] args) {
        System.out.println("--- One to Ten Printer ---");
        int i = 1;
        StringBuilder sb = new StringBuilder();
        do {
            sb.append(i).append(" ");
            i++;
        } while (i <= 10);
        System.out.println(sb.toString().trim());
    }
}
