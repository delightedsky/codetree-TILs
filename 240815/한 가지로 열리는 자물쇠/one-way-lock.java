import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int totalCombinations = N * N * N;
        int unlockedCombinations = 1;

        unlockedCombinations *= countUnlocked(N, a);
        unlockedCombinations *= countUnlocked(N, b);
        unlockedCombinations *= countUnlocked(N, c);

        int result = totalCombinations - unlockedCombinations;
        System.out.println(result);
    }

    private static int countUnlocked(int N, int digit) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (Math.abs(digit - i) <= 2) {
                count += 1;
            }
        }
        return count;
    }
}