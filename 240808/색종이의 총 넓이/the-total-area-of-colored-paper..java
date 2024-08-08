import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean[][] grid = new boolean[201][201]; // 201x201 크기의 격자

        // 입력 받기
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt() + 100; // 좌표를 [0, 200] 범위로 변환
            int y = scanner.nextInt() + 100; // 좌표를 [0, 200] 범위로 변환
            for (int dx = 0; dx < 8; dx++) {
                for (int dy = 0; dy < 8; dy++) {
                    grid[x + dx][y + dy] = true;
                }
            }
        }
        scanner.close();

        // 넓이 계산
        int area = 0;
        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < 201; j++) {
                if (grid[i][j]) {
                    area++;
                }
            }
        }

        System.out.println(area);
    }
}