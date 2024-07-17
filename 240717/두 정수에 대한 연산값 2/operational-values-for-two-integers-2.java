import java.util.Scanner;

public class Main {
    public static void function(int a, int b) {
        if (a > b) {
            b += 10;
            a *= 2;
        } else {
            a += 10;
            b *= 2;
        }

        System.out.print(a + " " + b);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        function(a,b);
    }
}