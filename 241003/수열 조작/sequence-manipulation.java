import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // 덱(Deque)을 사용하여 1부터 N까지 숫자를 저장
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }
        
        // 정수가 하나만 남을 때까지 반복
        while (deque.size() > 1) {
            deque.pollFirst(); // 맨 앞의 정수를 제거
            deque.addLast(deque.pollFirst()); // 그 후 남은 수열의 맨 앞의 정수를 맨 뒤로 이동
        }
        
        // 마지막 남은 정수 출력
        System.out.println(deque.peek());
    }
}