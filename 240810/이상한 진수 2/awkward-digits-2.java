import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int maxN = 0;

        int original = Integer.parseInt(a, 2);

        for (int i = 0; i < a.length(); i++) {
            char[] modified = a.toCharArray();
            modified[i] = (a.charAt(i) == '0') ? '1' : '0';
            
            int modifiedValue = Integer.parseInt(new String(modified), 2);

            if (modifiedValue > original) {
                maxN = Math.max(maxN, modifiedValue);
            }
        }

        System.out.println(maxN);
    }
}