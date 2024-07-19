import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static boolean equal(int[] A, int[] B) {
        for (int i = 0; i < A.length ; i++) {
            if(A[i] != B[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0 ; i < n ; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B); 

        if (equal(A, B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}