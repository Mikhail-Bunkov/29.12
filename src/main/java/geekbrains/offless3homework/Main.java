package geekbrains.offless3homework;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int of = 1;
        while (of !=0) {
            int lives = 3;
            method(lives);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            of = scan.nextInt();
        }
    }
    private static void method( int lives)
    {
        Random random = new Random() ;
        Scanner scanner = new Scanner(System.in);
        int x;
        int j = random.nextInt()*10;
        for (int i = 0; i<3; i++)
        {
            System.out.println("Введите число: ");
            x= scanner.nextInt();
            if (x > j)
            {
                System.out.println("Введеное число больше загаданного. Минус одна попытка, лузер ");
                lives--;
            }
            if (x < j)
            {
                System.out.println("Введеное число меньше загаданного. Минус одна попытка, лузер ");
                lives--;
            }
            if (x == j)
            {
                System.out.println("Угадал. Гад везучий");
                break;
            }
        }
    }
}
