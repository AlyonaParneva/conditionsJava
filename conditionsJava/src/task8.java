import java.util.Scanner;

public class task8 {
    public static boolean is35(int x) {
        boolean divBy3 = x % 3 == 0;
        boolean divBy5 = x % 5 == 0;
        return (divBy3 ^ divBy5);
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scanner.nextInt();
        boolean result = is35(x);
        System.out.println("Число делится на 3 или 5: " + result);
    }
}
