import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество строк массива: ");
        int rowNumber = input.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int columnNumber = input.nextInt();

        if (rowNumber <= 0 || columnNumber <= 0) {
            System.out.println("Размеры массива должны быть больше нуля.");
            return;
        }

        int[][] array = createArray(rowNumber, columnNumber);
        fillArrayWithRandomNumbers(array);
        int[][] neighborSumArray = calculateNeighborSums(array);

        System.out.println("Сгенерированный массив:\n" + arrayToString(array));
        System.out.println("Массив после вычисления:\n" + arrayToString(neighborSumArray));
    }

    private static int[][] createArray(int rowNumber, int columnNumber) {
        return new int[rowNumber][columnNumber];
    }

    private static void fillArrayWithRandomNumbers(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
    }

    private static int[][] calculateNeighborSums(int[][] array) {
        int[][] result = new int[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int sum = 0;

                // проверка соседа сверху
                if (i > 0) sum += array[i - 1][j];
                // проверка соседа снизу
                if (i < array.length - 1) sum += array[i + 1][j];
                // проверка соседа справа
                if (j < array[i].length - 1) sum += array[i][j + 1];
                // проверка соседа слева
                if (j > 0) sum += array[i][j - 1];

                result[i][j] = sum;
            }
        }
        return result;
    }

    private static String arrayToString(int[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int[] row : array) {
            sb.append(Arrays.toString(row)).append("\n");
        }
        return sb.toString();
    }
}


