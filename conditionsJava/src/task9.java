import java.util.Scanner;

public class task9 {
    public static boolean magic6(int x, int y) {
        return x == 6 || y == 6 || (x + y == 6) || (x - y == 6);
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число (x): ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число (y): ");
        int y = scanner.nextInt();
        boolean result = magic6(x, y);
        System.out.println("Равно 6: " + result);
    }
}
