import java.util.Scanner;

public class Main {

    public static void findgcd(int n, int m) {
        int gcd = 0;

        for (int i = Math.min(n,m) ; i <= n*m ; i++) {
            if ( i % m == 0 && i % n == 0) {
                gcd = i;
                break;
            }

        }
        System.out.println(gcd);

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        findgcd(n, m);
        
    }
}