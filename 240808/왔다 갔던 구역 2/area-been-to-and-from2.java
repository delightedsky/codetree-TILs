import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int currentPosition = 0;

        HashMap<Integer, Integer> positionCounts = new HashMap<>();

        // 시작 지점도 1번 지나감으로 기록
        positionCounts.put(currentPosition, 1);

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            String direction = scanner.next();

            // 이동하면서 각 위치의 방문 횟수를 기록
            for (int j = 0; j < x; j++) {
                if (direction.equals("R")) {
                    currentPosition++;
                } else if (direction.equals("L")) {
                    currentPosition--;
                }
                positionCounts.put(currentPosition, positionCounts.getOrDefault(currentPosition, 0) + 1);
            }
        }
        scanner.close();

        // 2번 이상 방문한 영역의 크기 계산
        int overlapCount = 0;
        for (int count : positionCounts.values()) {
            if (count >= 2) {
                overlapCount++;
            }
        }

        System.out.println(overlapCount);
    }
}