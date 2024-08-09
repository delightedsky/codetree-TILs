import java.util.Scanner;

public class Main {
    static int R, C;
    static char[][] grid;
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        R = scanner.nextInt();
        C = scanner.nextInt();
        grid = new char[R][C];
        
        for (int i = 0; i < R; i++) {
            grid[i] = scanner.next().toCharArray();
        }
        
        dfs(0, 0, 0, 0);
        System.out.println(count);
    }
    
    static void dfs(int r, int c, int jumps, int lastColor) {
        if (r == R - 1 && c == C - 1) {
            if (jumps == 2) {
                count++;
            }
            return;
        }
        
        for (int nr = r + 1; nr < R; nr++) {
            for (int nc = c + 1; nc < C; nc++) {
                if (grid[nr][nc] != grid[r][c]) {
                    dfs(nr, nc, jumps + 1, grid[nr][nc]);
                }
            }
        }
    }
}