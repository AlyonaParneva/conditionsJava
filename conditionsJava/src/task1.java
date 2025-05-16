import java.util.Scanner;

public class task1 {
    public static int abs(int x) {
        return x < 0 ? -x : x;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int x = scanner.nextInt();
        int result = abs(x);
        System.out.println("Результат - модуль числа: " + result);
    }
}
