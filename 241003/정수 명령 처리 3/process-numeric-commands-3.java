import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 덱을 LinkedList로 구현
        Deque<Integer> deque = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        // 명령의 개수 입력
        int N = Integer.parseInt(scanner.nextLine());
        
        // 입력 명령 처리
        for (int i = 0; i < N; i++) {
            String command = scanner.nextLine();
            if (command.startsWith("push_front")) {
                int num = Integer.parseInt(command.split(" ")[1]);
                deque.offerFirst(num); // 덱의 앞에 삽입
            } else if (command.startsWith("push_back")) {
                int num = Integer.parseInt(command.split(" ")[1]);
                deque.offerLast(num); // 덱의 뒤에 삽입
            } else if (command.equals("pop_front")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.pollFirst()); // 덱의 앞에서 제거 후 출력
                } else {
                    System.out.println("-1");
                }
            } else if (command.equals("pop_back")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.pollLast()); // 덱의 뒤에서 제거 후 출력
                } else {
                    System.out.println("-1");
                }
            } else if (command.equals("size")) {
                System.out.println(deque.size()); // 덱의 크기 출력
            } else if (command.equals("empty")) {
                System.out.println(deque.isEmpty() ? 1 : 0); // 덱이 비어있는지 확인
            } else if (command.equals("front")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.peekFirst()); // 덱의 앞에 있는 값 출력
                } else {
                    System.out.println("-1");
                }
            } else if (command.equals("back")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.peekLast()); // 덱의 뒤에 있는 값 출력
                } else {
                    System.out.println("-1");
                }
            }
        }
        
        // 자원 해제 (Scanner 닫기)
        scanner.close();
    }
}