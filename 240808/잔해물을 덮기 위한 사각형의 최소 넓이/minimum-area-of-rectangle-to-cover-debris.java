import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 직사각형
        int x1_1 = scanner.nextInt();
        int y1_1 = scanner.nextInt();
        int x2_1 = scanner.nextInt();
        int y2_1 = scanner.nextInt();

        // 두 번째 직사각형
        int x1_2 = scanner.nextInt();
        int y1_2 = scanner.nextInt();
        int x2_2 = scanner.nextInt();
        int y2_2 = scanner.nextInt();

        // 겹치는 부분의 좌표 계산
        int overlapX1 = Math.max(x1_1, x1_2);
        int overlapY1 = Math.max(y1_1, y1_2);
        int overlapX2 = Math.min(x2_1, x2_2);
        int overlapY2 = Math.min(y2_1, y2_2);

        int overlapWidth = Math.max(0, overlapX2 - overlapX1);
        int overlapHeight = Math.max(0, overlapY2 - overlapY1);
        int overlapArea = overlapWidth * overlapHeight;

        // 첫 번째 직사각형의 넓이
        int rect1Area = (x2_1 - x1_1) * (y2_1 - y1_1);

        // 남아있는 첫 번째 직사각형의 넓이
        int remainingArea = rect1Area - overlapArea;

        // 최소 직사각형의 넓이 계산
        System.out.println(remainingArea);
        
        scanner.close();
    }
}