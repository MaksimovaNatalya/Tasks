package by.epam.maksimova;

//Написать программу нахождения суммы большего и меньшего из трех чисел.


import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        int x, y, z;
        System.out.println("Введите три числа");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        int[] array = new int[]{x, y, z};
        Arrays.sort(array);
        int sum = array[0] + array[array.length - 1];
        System.out.println("Сумма минимального числа - " + array[0]);
        System.out.println("Сумма максимального числа - " + array[array.length - 1]);
        System.out.println("Сумма минимального и максимального чисел - " + sum);
    }
}
