import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCount {
    public static void main(String[] args) {
        System.out.println("Введите текст, в котором хотите посчитать количество гласных: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println("Количество гласных в тексте: " + countVowels(text));
    }

    private static int countVowels(String text) {
        int vowelCount = 0;

        Pattern vowelPattern = Pattern.compile("(?iu)[aeiou]");
        Matcher vowelMather = vowelPattern.matcher(text);

        while(vowelMather.find()) {
            vowelCount++;
        }
        return vowelCount;
    }
}