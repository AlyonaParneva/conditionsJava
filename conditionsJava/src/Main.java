import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания (1–12):");
        int choice = scanner.nextInt();
        switch (choice) {
            case 5 -> task5.run();
            default -> System.out.println("Такого задания нет :(");
        }
    }
}
