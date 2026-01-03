package practice4.breakAndContinueSolver;

public class SkipMultiplesOfThree {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int start = 1;
        int end = 20;
        for(int i = start; i <= end; i++){
            if (i % 3 == 0) {
                continue;
            }
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
