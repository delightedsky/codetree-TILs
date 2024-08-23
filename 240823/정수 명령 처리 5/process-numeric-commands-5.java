import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String command = sc.next();
            if (command.equals("push_back")) {
                int A = sc.nextInt();
                array.add(A);
            } else if (command.equals("pop_back")) {
                array.remove(array.size() - 1);
            } else if (command.equals("size")) {
                System.out.println(array.size());
            } else if (command.equals("get")) {
                int k = sc.nextInt();
                System.out.println(array.get(k - 1));
            }
        }
        sc.close();
    }
}