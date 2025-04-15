/*
Программа получает на вход четыре числа от 1 до 8 каждое,
задающие номер столбца и номер строки сначала для первой клетки,
потом для второй клетки.

Шахматная ладья ходит по горизонтали или вертикали.
Даны две различные клетки шахматной доски,
определите, может ли ладья попасть с первой клетки на вторую одним ходом.

Пример ввода: 3 5 7 5
 */

import java.util.Scanner;

public class ChessBoard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if (a == c || b == d) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

/*
Шахматный король ходит по горизонтали, вертикали и диагонали,
но только на 1 клетку. Даны две различные клетки шахматной доски,
определите, может ли король попасть с первой клетки на вторую одним ходом.

Пример ввода: 8 8 7 7
 */


/* class ChessBoard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if ((Math.abs(b - d) == 1 && a - c == 0) // двигаемся по оси Y вправо/влево
                || (Math.abs(a - c) == 1 && b - d == 0) // двигаемся по оси Х вверх/вниз
                || (Math.abs(a - c) == 1 && Math.abs(b - d) == 1) // двигаемся по диагонали
                || (Math.abs(a - c) == 0 && Math.abs(b - d) == 0)) //  не двигаемся
        {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

/*
Шахматный слон ходит по диагонали.
Даны две различные клетки шахматной доски,
определите, может ли слон попасть с первой клетки на вторую одним ходом.

Пример ввода: 2 2 5 4
 */

/* class ChessBoard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if (Math.abs(a - c) == Math.abs(b - d)) // слон двигается по диагонали
        {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
 */
