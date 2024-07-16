import java.util.Scanner;

class IntWrapper{
    int value;
    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {

    public static void confirm(IntWrapper a, IntWrapper b) {
        if (a.value > b.value) {
            b.value *= 2;
            a.value += 25;
        } else {
            a.value *= 2;
            b.value += 25;
        }
        return;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrapper aWrapper = new IntWrapper(a);
        IntWrapper bWrapper = new IntWrapper(b);
        confirm(aWrapper, bWrapper);

        a = aWrapper.value;
        b = bWrapper.value;
        System.out.print(a + " " + b);
    }
}