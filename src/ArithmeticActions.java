import java.util.Scanner;

public class ArithmeticActions {
    public static void main(String[] args) {
        System.out.print("Введите число а: ");
        int a = new Scanner(System.in).nextInt();

        System.out.print("Введите число b: ");
        int b = new Scanner(System.in).nextInt();

        int sum = sum(a, b);
        System.out.println("Сумма  чисел равна: " + sum);

        int  multiplication = multiplication(a, b);
        System.out.println("Произведение чисел равно: " + multiplication);

        int division = division(a, b);
        System.out.println("Результат деления равен: " + division);

        int max = max(a, b);
        System.out.println("Максимальное число из двух равно: " + max);

        int min = min(a, b);
        System.out.println("Минимальное число из двух равно: " + min);
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int multiplication(int a, int b) {
        return a * b;
    }

    private static int division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Деление на 0 запрещено!");
            return -1;
        }
    }

    private static int max(int a, int b) {
        return Math.max(a, b);
    }

    private static int min (int a, int b) {
        return Math.min(a, b);
    }
}
