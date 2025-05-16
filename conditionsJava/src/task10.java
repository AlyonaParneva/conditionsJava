import java.util.Scanner;

public class task10 {
    public static String age(int x) {
        int lastDigit = x % 10;
        int lastTwoDigits = x % 100;
        if (lastDigit == 1 && lastTwoDigits != 11) {
            return x + " год";
        } else if ((lastDigit >= 2 && lastDigit <= 4) && !(lastTwoDigits >= 12 && lastTwoDigits <= 14)) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст (целое число): ");
        int x = scanner.nextInt();
        String result = age(x);
        System.out.println("Вам " + result);
    }
}
