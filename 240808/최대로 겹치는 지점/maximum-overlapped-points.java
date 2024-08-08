import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] events = new int[102]; // 0 ~ 101 인덱스 사용 (1 <= x1 < x2 <= 100)

        for (int i = 0; i < n; i++) {
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            events[x1]++;
            events[x2 + 1]--;  // x2+1에서 겹치는 선분 수를 줄임
        }
        scanner.close();

        int maxOverlap = 0;
        int currentOverlap = 0;

        for (int i = 1; i < 101; i++) { // 1 ~ 100 까지 순회
            currentOverlap += events[i];
            if (currentOverlap > maxOverlap) {
                maxOverlap = currentOverlap;
            }
        }

        System.out.println(maxOverlap);
    }
}