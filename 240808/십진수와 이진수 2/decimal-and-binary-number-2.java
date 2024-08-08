import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryString = scanner.nextLine();
        scanner.close();

        int decimalValue = Integer.parseInt(binaryString, 2);
        int multipliedValue = decimalValue * 17;
        String result = Integer.toBinaryString(multipliedValue);

        System.out.println(result);
    }
}