import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];

        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }

        int minArea = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
            int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;

            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                minX = Math.min(minX, x[j]);
                maxX = Math.max(maxX, x[j]);
                minY = Math.min(minY, y[j]);
                maxY = Math.max(maxY, y[j]);
            }

            int area = (maxX - minX) * (maxY - minY);
            minArea = Math.min(minArea, area);
        }

        System.out.println(minArea);
    }
}