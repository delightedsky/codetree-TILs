import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        int maxAreaTimesTwo = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;

                    if (points[i][1] == points[j][1] && points[i][0] == points[k][0]) {
                        int dx = Math.abs(points[i][0] - points[j][0]);
                        int dy = Math.abs(points[i][1] - points[k][1]);
                        int areaTimesTwo = dx * dy;

                        if (areaTimesTwo > maxAreaTimesTwo) {
                            maxAreaTimesTwo = areaTimesTwo;
                        }
                    }
                }
            }
        }

        System.out.println(maxAreaTimesTwo);

        scanner.close();
    }
}