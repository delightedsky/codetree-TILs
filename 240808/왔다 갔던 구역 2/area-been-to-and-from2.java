import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int currentPosition = 0;

        HashMap<Integer, Integer> positionCounts = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            String direction = scanner.next();
            
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

        int overlapCount = 0;
        for (int count : positionCounts.values()) {
            if (count >= 2) {
                overlapCount++;
            }
        }

        System.out.println(overlapCount);
    }
}