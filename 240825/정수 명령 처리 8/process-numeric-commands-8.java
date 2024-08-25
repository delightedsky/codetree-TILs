import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String command = sc.next();
            switch (command) {
                case "push_front":
                    int frontValue = sc.nextInt();
                    list.addFirst(frontValue);
                    break;
                case "push_back":
                    int backValue = sc.nextInt();
                    list.addLast(backValue);
                    break;
                case "pop_front":
                    System.out.println(list.pollFirst());
                    break;
                case "pop_back":
                    System.out.println(list.pollLast());
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
                case "empty":
                    System.out.println(list.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    System.out.println(list.getFirst());
                    break;
                case "back":
                    System.out.println(list.getLast());
                    break;
            }
        }
        sc.close();
    }
}