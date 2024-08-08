import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        String result = "";
        while (N > 0) {
            result = (N % B) + result;
            N /= B;
        }

        System.out.println(result);
    }
}