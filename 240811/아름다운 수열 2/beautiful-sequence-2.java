import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N과 M 입력
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        // 수열 A 입력
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // 수열 B 입력
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = scanner.nextInt();
        }
        
        // 수열 B 정렬
        Arrays.sort(B);
        
        int count = 0;
        
        // 수열 A의 모든 길이 M의 부분 수열을 체크
        for (int i = 0; i <= N - M; i++) {
            int[] subArray = Arrays.copyOfRange(A, i, i + M);
            Arrays.sort(subArray);
            
            if (Arrays.equals(subArray, B)) {
                count++;
            }
        }
        
        // 결과 출력
        System.out.println(count);
    }
}