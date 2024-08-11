import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] grid = new int[N][N];
        
        // 격자 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        
        int maxCoins = 0;
        
        // 첫 번째 1*3 격자 선택
        for (int i1 = 0; i1 < N; i1++) {
            for (int j1 = 0; j1 < N - 2; j1++) {
                int coins1 = grid[i1][j1] + grid[i1][j1 + 1] + grid[i1][j1 + 2];
                
                // 두 번째 1*3 격자 선택 (첫 번째 격자와 겹치지 않도록)
                for (int i2 = 0; i2 < N; i2++) {
                    for (int j2 = 0; j2 < N - 2; j2++) {
                        if (i1 == i2 && (j1 == j2 || j1 == j2 + 1 || j1 == j2 + 2 || j1 + 1 == j2 || j1 + 2 == j2)) {
                            continue;
                        }
                        int coins2 = grid[i2][j2] + grid[i2][j2 + 1] + grid[i2][j2 + 2];
                        maxCoins = Math.max(maxCoins, coins1 + coins2);
                    }
                }
            }
        }
        
        System.out.println(maxCoins);
    }
}