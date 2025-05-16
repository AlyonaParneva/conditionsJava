import java.util.Scanner;

public class task11 {
    public static String day(int x) {
        return switch (x) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> "это не день недели";
        };
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер дня недели (1–7): ");
        int x = scanner.nextInt();

        String result = day(x);
        System.out.println("Сегодня " + result);
    }
}
