import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        int minDistance = Integer.MAX_VALUE;

        // 각 집을 선택했을 때의 총 이동 거리 계산
        for (int target = 0; target < n; target++) {
            int currentDistance = 0;
            for (int i = 0; i < n; i++) {
                currentDistance += A[i] * Math.abs(target - i);
            }
            // 최소 이동 거리 갱신
            if (currentDistance < minDistance) {
                minDistance = currentDistance;
            }
        }

        System.out.println(minDistance);
    }
}