import java.util.Scanner;

public class Main {

    public static void insertionSort(int[] arr) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 줄 입력: n개의 원소 수
        int n = sc.nextInt();
        
        // 두 번째 줄 입력: 배열 원소들
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 삽입 정렬 수행
        insertionSort(arr);
        
        // 정렬된 배열 출력
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}