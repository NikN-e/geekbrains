import java.util.Scanner;
import java.util.Random;

public class Lesson4 {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();


    public static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;

            }

        }
    }

    public static void printMap(){
        for (int i = 0; i <= SIZE ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }


    public static void humanTurn(){
        int x,y;
        do{
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() -1;
            y = sc.nextInt() -1;
        }while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    private static boolean isCellValid(int x, int y) {
        if(x < 0 || x >=SIZE || y < 0 || y >= SIZE) return false;
        if(map[x][y] == DOT_EMPTY) return true;
        return false;
    }

    private static void aiTurn(){
        int x, y;
        do{
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        }while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_0;
    }

    public static boolean checkWin(char symb) {
      /*  if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;*/

        int count_symbY = 0;
        int count_symbX;
        int count_d1 = 0;
        int count_d2 = 0;
        for (int i = 0; i < SIZE; i++) {
            count_symbX = 0;

            for (int j = 0; j < SIZE; j++){
                if(j == 0){
                    count_symbY = 0;
                }
                if(map[i][j] == symb){
                    count_symbX += 1;

                }
                if(map[j][i] == symb){
                    count_symbY = count_symbY + 1;
                }
                if(count_symbY == SIZE) return true;

                if(i == j && map[i][j] == symb){
                    count_d1 += 1;
                }
                if(j + 1 == (SIZE - i) && map[i][j] == symb){
                    count_d2 += 1;
                }
            }
            if(count_symbX == SIZE) return true;
        }
        if(count_d1 == SIZE) return true;
        if(count_d2 == SIZE) return true;

        return false;
    }


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_0)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

}

