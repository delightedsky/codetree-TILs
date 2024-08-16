import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[][] points = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            points[i][0] = scanner.nextInt(); // x-coordinate
            points[i][1] = scanner.nextInt(); // y-coordinate
        }
        
        int minDistanceSquared = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dx = points[i][0] - points[j][0];
                int dy = points[i][1] - points[j][1];
                int distanceSquared = dx * dx + dy * dy;
                
                if (distanceSquared < minDistanceSquared) {
                    minDistanceSquared = distanceSquared;
                }
            }
        }
        
        System.out.println(minDistanceSquared);
        
        scanner.close();
    }
}