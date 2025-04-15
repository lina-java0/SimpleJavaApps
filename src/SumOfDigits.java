public class SumOfDigits {
    public static void main(String[] args) {
        printNumbersFrom0to1000();
    }

    public static void printNumbersFrom0to1000() {
        for (int i = 0; i <= 1000; i++) {
            int sum = getDigitSum(i);
            if (i % 3 == 0 && i % 5 != 0 && sum < 10) {
                System.out.println(i);
            }
        }
    }

    public static int getDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
