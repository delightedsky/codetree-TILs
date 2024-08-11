import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S = sc.nextInt();

        int[] nums = new int[N];
        int totalSum = 0;

        for(int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
            totalSum += nums[i];
        }

        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                int currentSum = totalSum - nums[i] - nums[j];
                int diff = Math.abs(currentSum - S);
                if(diff < minDiff) {
                    minDiff = diff;
                }
            }
        }

        System.out.println(minDiff);
    }
}