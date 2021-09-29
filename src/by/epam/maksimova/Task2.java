package by.epam.maksimova;

import java.util.Scanner;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Task2 {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Введите 3 числа");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        double result;

        result = ((b + (sqrt(pow(b, 2)) + 4 * a * c)) / 2 * a) - (pow(a, 3) * c) + b * b;

        System.out.println(result);


    }
}
