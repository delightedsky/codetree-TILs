import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] abilities = new int[6];

        for (int i = 0; i < 6; i++) {
            abilities[i] = scanner.nextInt();
        }

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                for (int k = j + 1; k < 6; k++) {
                    int sum1 = abilities[i] + abilities[j] + abilities[k];
                    int sum2 = Arrays.stream(abilities).sum() - sum1;
                    int difference = Math.abs(sum1 - sum2);
                    minDifference = Math.min(minDifference, difference);
                }
            }
        }

        System.out.println(minDifference);
    }
}