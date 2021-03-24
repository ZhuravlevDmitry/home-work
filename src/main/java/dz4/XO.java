
/*
 *	Журавлев Дмитрий
 *	Д/З № 4
 */
package dz4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class XO {

    private static final char DEFAULT = '_';
    private static final char X = 'X';
    private static final char O = 'O';
    private static final int SIZE = 5;
    private static final char[][] MAP = new char[SIZE][SIZE];

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DEFAULT;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void game(Scanner in) {
        initMap();
        System.out.println("Игра Крестики Нолики");
        System.out.println("Для хода необходимо ввести номер строки и номер столбца");
        int stepCounter = 0;
        while (true) {
            System.out.println("Ваш ход: ");
            String line = in.nextLine();
            String[] args = line.split(" "); // 12 1212 -> [12, 1212]
            if (args.length != 2) {
                System.out.println("Введите два числа");
            } else {
                try {
                    int x = Integer.parseInt(args[0]);
                    int y = Integer.parseInt(args[1]);
                    x--;
                    y--;
                    if (isValid(x, y)) {
                        makeStep(x, y, X);
                        printMap();
                        stepCounter++;
                        if (checkWin(X)) {
                            System.out.println("Вы победили");
                            return;
                        }
                        if (stepCounter == SIZE*SIZE) {
                            System.out.println("Ничья");
                            return;
                        }
                        System.out.println("Ход компьютера: ");
                        // joke();
                        movePC();
                        printMap();
                        stepCounter++;
                        if (checkWin(O)) {
                            System.out.println("Вы проиграли");
                            return;
                        }
                    } else {
                        System.out.println("Некорректный ход.\n" +
                                "Введите два числа от 1 до 3");
                    }
                } catch (Exception e) {
                    System.out.println("Введите два числа");
                }
            }
        }
    }

    private static void joke() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(700);
        System.out.println("Думаю о тебе");
        TimeUnit.MILLISECONDS.sleep(700);
        System.out.println("Майню биткоин");
        TimeUnit.MILLISECONDS.sleep(700);
        System.out.println("Читаю твою личку в фейсбуке");
        TimeUnit.MILLISECONDS.sleep(700);
        System.out.println("Ворую рубль со счета");
        TimeUnit.MILLISECONDS.sleep(700);
        System.out.println("Отправляю письмо бывшей");
    }

    private static void movePC() {
        //Уровень лёгкий
        int x = (int) (Math.random() * SIZE);
        int y = (int) (Math.random() * SIZE);
        while (MAP[x][y] == '0' || MAP[x][y] == 'X') {
            x = (int) (Math.random() * SIZE);
            y = (int) (Math.random() * SIZE);
        }
        MAP[x][y] = '0';
    }

    /** Проверяем горизонтальные и вертикальные линии */
    static boolean checkLanes(char x, int ofsetx, int ofsety) {
        boolean cols, rows;
        for (int col = ofsetx; col < ofsetx + 4; col++) {
            cols = true;
            rows = true;
            for (int row = ofsety; row < ofsety + 4; row++) {
                cols &= (MAP[col][row] == x);
                rows &= (MAP[row][col] == x);
            }
            // Это условие после каждой проверки колонки и столбца
            // позволяет остановить дальнейшее выполнение, без проверки
            // всех остальных столбцов и строк.
            if (cols || rows) return true;
        }
        return false;
    }

    /** Проверяем диагонали */
    static boolean checkDiagonal(char x, int ofsetx, int ofsety) {
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i=ofsetx; i<ofsetx+4; i++) {
            toright &= (MAP[i][ofsety+i-ofsetx] == x);
            toleft &= (MAP[ofsetx+4-i-1][ofsety+i-ofsetx] == x);
        }

        if (toright || toleft) return true;

        return false;
    }

    static boolean checkWin(char x) {
        for (int col=0; col<2; col++) {
            for (int row=0; row<2; row++) {
                // Вызываем методы проверки и если хоть один блок заполнен,
                // то игрок, который проставляет это символ, выиграл
                // иначе продолжаем для другого смещения
                if (checkDiagonal(x, col, row) || checkLanes(x, col, row)) return true;
            }
        }
        // Все подквадраты в квадрате проверены. 4-х последовательностей
        // подряд не выявлено. Значит еще не победа.
        return false;
    }

    private static void makeStep(int x, int y, char sym) {
        MAP[x][y] = sym;
    }

    private static boolean isValid(int x, int y) {
        return x >= 0
                && x < SIZE
                && y >= 0
                && y < SIZE
                && MAP[x][y] == DEFAULT;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        game(in);
    }

}
