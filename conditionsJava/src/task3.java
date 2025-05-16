import java.util.Scanner;

public class task3 {
    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число (x): ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число (y): ");
        int y = scanner.nextInt();
        int result = max(x, y);
        System.out.println("Результат - максимальное значение: " + result);
    }
}
