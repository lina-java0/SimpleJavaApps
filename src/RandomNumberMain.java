import java.util.Random;
import java.util.Scanner;

public class RandomNumberMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(1, 101);

        int guessedNumber;
        int attemptCount = 0;

        System.out.println("Игра началась!\uD83C\uDFAE" +
                "\nЯ загадала число от 1 до 100. Попробуйте его угадать!");

        while (true) {
            System.out.print("Введите ваше число: ");
            guessedNumber = input.nextInt();
            attemptCount++;

            if (guessedNumber <= 0 || guessedNumber > 100) {
                System.out.println("⚠\uFE0FПожалуйста, введите число от 1 до 100.");
                continue;
            }

            if (guessedNumber < randomNumber) {
                System.out.println("\uD83D\uDD3CСлишком мало.");
            } else if (guessedNumber > randomNumber) {
                System.out.println("\uD83D\uDD3DСлишком много.");
            } else {
                System.out.println("\uD83C\uDF89Вы угадали!");
                break;
            }
        }

        System.out.println("Количество попыток: " + attemptCount);
    }
}
