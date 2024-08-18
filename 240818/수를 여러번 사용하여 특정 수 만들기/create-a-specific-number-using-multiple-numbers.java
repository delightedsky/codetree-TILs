import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();
        
        int maxValue = 0;
        
        for (int x = 0; A * x <= C; x++) {
            int remaining = C - A * x;
            int maxB = remaining / B * B;
            int candidate = A * x + maxB;
            maxValue = Math.max(maxValue, candidate);
        }
        
        System.out.println(maxValue);
    }
}