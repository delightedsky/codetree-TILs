import java.util.Scanner;

public class Main {

    public static boolean isPrime(int n) {
        for (int i = 2; i < n ; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(int n) {
        if (((n / 10) + (n % 10)) % 2 == 0) {return true;}
        return false;
    }

    public static boolean isTrue(int n) {
        if (isPrime(n) == true && isEven(n) == true)
            return true;
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for (int i = a ; i <= b ; i++) {
            if (isTrue(i) == true) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}