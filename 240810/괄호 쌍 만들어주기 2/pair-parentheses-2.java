import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < input.length() - 3; i++) {
            if (input.charAt(i) == '(' && input.charAt(i + 1) == '(') {
                for (int j = i + 2; j < input.length() - 1; j++) {
                    if (input.charAt(j) == ')' && input.charAt(j + 1) == ')') {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}