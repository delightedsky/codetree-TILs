import java.util.*;

public class Main {

    public static int calculateOperatingTime(List<int[]> intervals) {
        intervals.sort(Comparator.comparingInt(o -> o[0]));
        
        int totalTime = 0;
        int currentStart = -1;
        int currentEnd = -1;

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            if (start > currentEnd) {
                totalTime += currentEnd - currentStart;
                currentStart = start;
                currentEnd = end;
            } else {
                currentEnd = Math.max(currentEnd, end);
            }
        }

        totalTime += currentEnd - currentStart;
        return totalTime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<int[]> intervals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            intervals.add(new int[]{a, b});
        }

        int maxOperatingTime = 0;

        for (int i = 0; i < n; i++) {
            List<int[]> tempIntervals = new ArrayList<>(intervals);
            tempIntervals.remove(i);

            int operatingTime = calculateOperatingTime(tempIntervals);
            maxOperatingTime = Math.max(maxOperatingTime, operatingTime);
        }

        System.out.println(maxOperatingTime);
    }
}