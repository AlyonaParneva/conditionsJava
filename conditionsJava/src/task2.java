import java.util.Scanner;

public class task2 {
    public static int safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return x / y;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите делимое (x): ");
        int x = scanner.nextInt();
        System.out.print("Введите делитель (y): ");
        int y = scanner.nextInt();
        int result = safeDiv(x, y);
        System.out.println("Результат деления: " + result);
    }
}
