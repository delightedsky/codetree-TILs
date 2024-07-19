import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int mid(int[] arr, int i) {
        if (i == 0) {return arr[0];}
        Arrays.sort(arr, 0, i+1);
        return arr[i/2];
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i= 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 0) {
            // System.out.print(i);
            System.out.print(mid(arr, i) + " ");
            }
        }


    }
}