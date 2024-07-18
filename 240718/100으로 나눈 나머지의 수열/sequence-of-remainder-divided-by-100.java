import java.util.Scanner;

public class Main {
    public static int sequence(int a){
        if (a == 1) {
            return 2;
        }
        if (a==2) {return 4;}

        return (sequence(a-1)*sequence(a-2)) % 100;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(sequence(n));

    }
}