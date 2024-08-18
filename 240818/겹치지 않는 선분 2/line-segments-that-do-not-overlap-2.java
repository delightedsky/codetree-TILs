import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<int[]> segments = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            segments.add(new int[]{x1, x2});
        }

        segments.sort(Comparator.comparingInt(o -> o[0]));

        int nonOverlappingCount = 0;
        int lastEnd = Integer.MIN_VALUE;

        for (int[] segment : segments) {
            int start = segment[0];
            int end = segment[1];

            if (start > lastEnd) {
                nonOverlappingCount++;
                lastEnd = end;
            } else {
                lastEnd = Math.min(lastEnd, end);
            }
        }

        System.out.println(nonOverlappingCount);
    }
}