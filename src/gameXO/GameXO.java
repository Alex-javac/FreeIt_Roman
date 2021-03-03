package gameXO;

import java.util.Scanner;

//написать игру крестики нолики (двумерный массив размерностью 3х3).
//Для этой задачи сделайте отдельную ветку
//1. Не используя классы и методы - все в методе main
//2. Не используя утильные классы (Arrays и Math)
//3. Игра должна продолжаться до тех пор, пока не будет выявлен победитель
// (три "О" или три "Х" в ряд или по диагонали) или пока не закончатся свободные клетки
public class GameXO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playGame = true;
        char[][] field = new char[3][3];
        int count = 0;

        System.out.println("----------Game XO----------");
        System.out.println("Представим поле видом «цифровой клавиатуры»");
        System.out.println("[7][8][9]");
        System.out.println("[4][5][6]");
        System.out.println("[1][2][3]");
        System.out.println("Чтоб выбрать нужную клеточку просто нажми соответствующую цифру");
        System.out.println("Первым наченает игрок Х");
        System.out.println("-------------GO-------------");

        while (playGame) {
            char xo = count % 2 == 0 ? 'X' : 'O';//каждый ход миняем знак либо Х либо О
            System.out.print("Ход игрока " + xo + " : ");
            int number = scanner.nextInt();

            switch (number) {//подстовляем значение в указанное место и меняем ход игрока
                case (1):
                    if (field[2][0] == '\u0000') {
                        field[2][0] = xo;
                        count++;
                    }
                    break;
                case (2):
                    if (field[2][1] == '\u0000') {
                        field[2][1] = xo;
                        count++;
                    }
                    break;
                case (3):
                    if (field[2][2] == '\u0000') {
                        field[2][2] = xo;
                        count++;
                    }
                    break;
                case (4):
                    if (field[1][0] == '\u0000') {
                        field[1][0] = xo;
                        count++;
                    }
                    break;
                case (5):
                    if (field[1][1] == '\u0000') {
                        field[1][1] = xo;
                        count++;
                    }
                    break;
                case (6):
                    if (field[1][2] == '\u0000') {
                        field[1][2] = xo;
                        count++;
                    }
                    break;
                case (7):
                    if (field[0][0] == '\u0000') {
                        field[0][0] = xo;
                        count++;
                    }
                    break;
                case (8):
                    if (field[0][1] == '\u0000') {
                        field[0][1] = xo;
                        count++;
                    }
                    break;
                case (9):
                    if (field[0][2] == '\u0000') {
                        field[0][2] = xo;
                        count++;
                    }
                    break;
            }
            int emptyElements = 9;
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (field[i][j] != '\u0000') {//проверяем сколько осталось пустых элементов
                        emptyElements--;

                    }
                    System.out.print("[" + field[i][j] + "]");
                }
                System.out.println();
            }


            if (emptyElements == 0) { //Кол-во ходов ограничено
                System.out.println("Победила дружба!");
                playGame = false;
            }
            //----------проверка по горизонтали
            if (field[0][0] != '\u0000' && field[0][0] == field[0][1] && field[0][1] == field[0][2]) {
                System.out.println("Игрок " + xo + " Победил!!!");
                playGame = false;
            } else if (field[1][0] != '\u0000' && field[1][0] == field[1][1] && field[1][1] == field[1][2]) {
                System.out.println("Игрок " + xo + " Победил!!!");
                playGame = false;
            } else if (field[2][0] != '\u0000' && field[2][0] == field[2][1] && field[2][1] == field[2][2]) {
                System.out.println("Игрок " + xo + " Победил!!!");
                playGame = false;
            }
            //---------------проверка по вертикали
            else if (field[0][0] != '\u0000' && field[0][0] == field[1][0] && field[1][0] == field[2][0]) {
                System.out.println("Игрок " + xo + " Победил!!!");
                playGame = false;
            } else if (field[0][1] != '\u0000' && field[0][1] == field[1][1] && field[1][1] == field[2][1]) {
                System.out.println("Игрок " + xo + " Победил!!!");
                playGame = false;
            } else if (field[0][2] != '\u0000' && field[0][2] == field[1][2] && field[1][2] == field[2][2]) {
                System.out.println("Игрок " + xo + " Победил!!!");
                playGame = false;
            }
            //---------------проверка по диогонали
            else if (field[0][0] != '\u0000' && field[0][0] == field[1][1] && field[1][1] == field[2][2]) {
                System.out.println("Игрок " + xo + " Победил!!!");
                playGame = false;
            } else if (field[0][2] != '\u0000' && field[0][2] == field[1][1] && field[1][1] == field[2][0]) {
                System.out.println("Игрок " + xo + " Победил!!!");
                playGame = false;
            }

        }
        System.out.println("Игра окончена");
    }
}
