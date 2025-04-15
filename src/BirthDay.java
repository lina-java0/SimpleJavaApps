import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class BirthDay {
    public static void main(String[] args) {
        int day;
        int month;
        int year;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число вашего рождения: ");
        day = scanner.nextInt();
        System.out.println("Введите месяц вашего рождения: ");
        month = scanner.nextInt();
        System.out.println("Введите год вашего рождения: ");
        year = scanner.nextInt();

        System.out.println(BirthDayCollector(year, month, day));
    }

    public static String BirthDayCollector(int year, int month, int day) {
        String result = "";
        LocalDate birthDay = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy-E").localizedBy(new Locale("RU"));

        int i = 0;
        while (birthDay.isBefore(today) || birthDay.isEqual(today)) {
            result += i++ + " - " + birthDay.format(formatter) + "\n";
            birthDay = birthDay.plusYears(1);
        }
        return result;
    }
}

