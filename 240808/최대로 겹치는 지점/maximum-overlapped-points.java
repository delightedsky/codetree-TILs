import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] events = new int[101]; // 1 <= x1 < x2 <= 100

        for (int i = 0; i < n; i++) {
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            events[x1]++;
            events[x2 + 1]--;  // x2+1에서 겹치는 선분 수를 줄임
        }
        scanner.close();

        int maxOverlap = 0;
        int currentOverlap = 0;

        for (int i = 0; i < 101; i++) {
            currentOverlap += events[i];
            if (currentOverlap > maxOverlap) {
                maxOverlap = currentOverlap;
            }
        }

        System.out.println(maxOverlap);
    }
}