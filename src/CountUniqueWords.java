import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class CountUniqueWords {
    public static void main(String[] args) {
        String text = "Java is great. Java is powerful. Streams are great in Java.";
        Map<String, Long> wordCounts = countUniqueWords(text);

        wordCounts.forEach((word, count) -> System.out.println(word + " : " + count));
    }

    public static Map<String, Long> countUniqueWords(String text) {
        return Arrays.stream(text.toLowerCase().split("\\W+"))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long> comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }
}
