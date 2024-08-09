import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] grid = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        
        int maxCoins = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= N - 3; j++) {
                int currentCoins = grid[i][j] + grid[i][j+1] + grid[i][j+2];
                maxCoins = Math.max(maxCoins, currentCoins);
            }
        }
        
        System.out.println(maxCoins);
    }
}