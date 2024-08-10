import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int maxSum = 0;
        
        // 모든 쌍을 확인
        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j < n; j++) { // j는 i+2부터 시작 (인접하지 않게 선택)
                int sum = arr[i] + arr[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        
        System.out.println(maxSum);
    }
}