import java.util.Scanner;

public class task7 {
    public static int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число (x): ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число (y): ");
        int y = scanner.nextInt();
        int result = sum2(x, y);
        System.out.println("Результат sum: " + result);
    }
}
