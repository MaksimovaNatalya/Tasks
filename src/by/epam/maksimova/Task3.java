package by.epam.maksimova;

//Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов

import java.util.Scanner;

import static java.lang.Math.*;

public class Task3 {
    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();

        double p, s;

        p = (sqrt(a * a + b * b)) + a + b;
        s = a * b / 2;

        System.out.println("Площадь прямоугольного треугольника - " + s);
        System.out.println("Периметр прямоугольного треугольника - " + p);
    }
}
