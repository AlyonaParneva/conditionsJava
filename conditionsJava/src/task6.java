import java.util.Scanner;

public class task6 {
    public static boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число (x): ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число (y): ");
        int y = scanner.nextInt();
        System.out.print("Введите третье число (z): ");
        int z = scanner.nextInt();
        boolean result = sum3(x, y, z);
        System.out.println("Можно сложить 2 числа так, чтобы получить третье: " + result);
    }
}
