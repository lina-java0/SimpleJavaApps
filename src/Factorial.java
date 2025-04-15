import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int value = new Scanner(System.in).nextInt();
        int valueFactorial = 1;

        for (int i = 1; i <= value; i = i + 1) {
            valueFactorial = valueFactorial * i;
        }
        System.out.println("Факториал введенного числа равен: " + valueFactorial);
    }
}
