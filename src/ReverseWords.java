public class ReverseWords {
    public static void main(String[] args) {
        String text = "Привет, меня зовут Полина! А как тебя?";
        System.out.print(reverseWords(text));
    }

    public static String reverseWords(String str){
        String[] text = str.replaceAll("\\p{P}", "").split(" ");
        int n = text.length;
        String temp;
        for (int i = 0; i < n / 2; i++) {
            temp = text[n - i - 1];
            text[n - i - 1] = text[i];
            text[i] = temp;
        }
        StringBuilder result = new StringBuilder();
        for (String word : text) {
            result.append(word).append(" ");
        }
        return result.toString();
    }
}
