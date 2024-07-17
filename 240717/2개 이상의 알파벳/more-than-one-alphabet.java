import java.util.Scanner;

public class Main {
    public static boolean twoAlp(String str) {
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if(str.charAt(0) != str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);

        String str = sc.nextLine();

        if (twoAlp(str) == true) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
}