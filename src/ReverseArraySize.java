/*
Дан двумерный массив. Поменяйте все строки и столбы местами.
То есть, измените массив так, чтобы в новом массиве первый столбец
являлся первой строкой в старом массиве, первая строка являлась первым столбцом и т.д.
Таким образом, массив размером n x m должен стать массивом размером m x n

Пример ввода:
3 4
1 2 3 4
5 6 7 8
9 10 11 12
 */

import java.util.Scanner;

class ReverseArraySize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = in.nextInt();
            }
        }

        int[][] result = new int[array[0].length][array.length];
        int counter = 0;
        for (int[] ints : array) {
            for (int i = 0; i < ints.length; i++) {
                result[i][counter] = ints[i];
            }
            counter++;
        }

        for (int[] i: result) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}