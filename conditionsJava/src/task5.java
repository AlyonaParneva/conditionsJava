import java.util.Scanner;

public class task5 {
    public static int max3(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число (x): ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число (y): ");
        int y = scanner.nextInt();
        System.out.print("Введите третье число (z): ");
        int z = scanner.nextInt();
        int result = max3(x, y, z);
        System.out.println("Максимальное из трёх чисел: " + result);
    }
}
