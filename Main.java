import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int closestSquare = 0;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i * i <= n; i++) {
            int diff = Math.abs(n - i * i);
            if (diff < minDiff) {
                minDiff = diff;
                closestSquare = i * i;
            }
        }

        System.out.println(closestSquare);
    }
}