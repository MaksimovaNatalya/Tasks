package by.epam.maksimova;

//Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h.
//        Результат представить в виде таблицы, первый столбец которой – значения  аргумента,
//        второй - соответствующие значения функции:

import java.util.Scanner;

import static java.lang.Math.*;

public class Task7 {
    public static void main(String[] args) {

        double a;
        double b;
        double h;
        double y;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        a=scanner.nextDouble();
        System.out.println("Введите b");
        b=scanner.nextDouble();
        System.out.println("Введите h");
        h= scanner.nextDouble();

        System.out.println(" -----------------------");
        System.out.println("|     x     |     y     |");
        System.out.println(" -----------------------");

        for (double i = a; i <= b; i += h) {
            y = (pow(sin(i), 2)) - (cos(2 * i));
            System.out.printf("|%11f|%11f|\n", i, y);
        }
        System.out.println(" -----------------------");

    }
}
