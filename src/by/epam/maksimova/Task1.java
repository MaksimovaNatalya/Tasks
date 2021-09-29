package by.epam.maksimova;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите любое четырехзначное число ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String s = Integer.toString(number);
        int[] array = new int[s.length()];

        for (int i = s.length() - 1; i >= 0; i--) {
            array[i] = number % 10;
            number /= 10;
        }

        if (array[0] + array[1] == array[2] + array[3]) {
            System.out.println("TRUE");
        } else
            System.out.println("FALSE");

        System.out.println(Arrays.toString(array));
    }
}
