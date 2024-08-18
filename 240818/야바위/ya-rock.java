import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] operations = new int[N][3];
        
        for (int i = 0; i < N; i++) {
            operations[i][0] = sc.nextInt();
            operations[i][1] = sc.nextInt();
            operations[i][2] = sc.nextInt();
        }
        
        int maxPoints = 0;
        
        for (int initialPosition = 1; initialPosition <= 3; initialPosition++) {
            int position = initialPosition;
            int points = 0;
            
            for (int i = 0; i < N; i++) {
                int a = operations[i][0];
                int b = operations[i][1];
                int c = operations[i][2];
                
                if (position == a) {
                    position = b;
                } else if (position == b) {
                    position = a;
                }
                
                if (position == c) {
                    points++;
                }
            }
            
            if (points > maxPoints) {
                maxPoints = points;
            }
        }
        
        System.out.println(maxPoints);
    }
}