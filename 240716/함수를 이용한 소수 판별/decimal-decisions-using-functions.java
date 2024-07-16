import java.util.Scanner;

public class Main {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n-1 ; i++) {
            if (n % i == 0 ) 
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        int sum = 0;
        for (int i = a ; i <= b ; i++) {
            if (isPrime(i) == true) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}