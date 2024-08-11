import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        int[] candyCount = new int[101];
        
        for (int i = 0; i < N; i++) {
            int candies = scanner.nextInt();
            int position = scanner.nextInt();
            candyCount[position] += candies;
        }
        
        int maxCandies = 0;
        
        for (int c = 0; c <= 100; c++) {
            int currentCandies = 0;
            int leftBound = Math.max(0, c - K);
            int rightBound = Math.min(100, c + K);
            
            for (int i = leftBound; i <= rightBound; i++) {
                currentCandies += candyCount[i];
            }
            
            maxCandies = Math.max(maxCandies, currentCandies);
        }
        
        System.out.println(maxCandies);
    }
}