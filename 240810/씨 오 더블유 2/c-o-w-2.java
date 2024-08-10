import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        
        long countC = 0; // 'C'의 개수
        long countO = 0; // 'O'의 개수 ('C'에 대한)
        long countW = 0; // 'W'의 개수 ('O'에 대한)
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'C') {
                countC++;
            } else if (ch == 'O') {
                countO += countC;
            } else if (ch == 'W') {
                countW += countO;
            }
        }
        
        System.out.println(countW);
    }
}