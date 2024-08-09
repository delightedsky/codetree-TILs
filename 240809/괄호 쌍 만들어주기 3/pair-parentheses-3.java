import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;

        // 문자열을 왼쪽에서 오른쪽으로 탐색
        for (int i = 0; i < input.length(); i++) {
            // 여는 괄호를 찾음
            if (input.charAt(i) == '(') {
                // 해당 여는 괄호 이후에 나오는 닫는 괄호들을 찾음
                for (int j = i + 1; j < input.length(); j++) {
                    if (input.charAt(j) == ')') {
                        count++;
                    }
                }
            }
        }

        // 가능한 모든 쌍의 개수 출력
        System.out.println(count);
    }
}