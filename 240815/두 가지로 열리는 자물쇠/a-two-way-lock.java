import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int[] combo1 = new int[3];
        int[] combo2 = new int[3];
        
        for (int i = 0; i < 3; i++) {
            combo1[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 3; i++) {
            combo2[i] = scanner.nextInt();
        }
        
        Set<String> validCombinations = new HashSet<>();
        
        for (int i = 0; i < 3; i++) {
            for (int j = -2; j <= 2; j++) {
                int val1 = (combo1[i] + j + N - 1) % N + 1;
                int val2 = (combo2[i] + j + N - 1) % N + 1;
                combo1[i] = val1;
                combo2[i] = val2;
            }
        }
        
        for (int i = -2; i <= 2; i++) {
            for (int j = -2; j <= 2; j++) {
                for (int k = -2; k <= 2; k++) {
                    int x = (combo1[0] + i + N - 1) % N + 1;
                    int y = (combo1[1] + j + N - 1) % N + 1;
                    int z = (combo1[2] + k + N - 1) % N + 1;
                    validCombinations.add(x + "," + y + "," + z);
                    
                    x = (combo2[0] + i + N - 1) % N + 1;
                    y = (combo2[1] + j + N - 1) % N + 1;
                    z = (combo2[2] + k + N - 1) % N + 1;
                    validCombinations.add(x + "," + y + "," + z);
                }
            }
        }
        
        System.out.println(validCombinations.size());
    }
}