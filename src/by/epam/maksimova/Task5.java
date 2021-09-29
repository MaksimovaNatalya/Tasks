package by.epam.maksimova;

import java.util.Scanner;

public class Task5 {
//    Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны,
//    и в четвертую степень — отрицательные.


    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Введите три числа");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();

        int[] array = new int[]{x, y, z};
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                System.out.println(i+1+"-e число во второй степени = " + array[i] * array[i]);
            } else System.out.println(i+1+"-e число в четвертой степени = " + Math.pow(array[i], 4));
        }
    }
}

//        if (x >= 0) {
//            System.out.println("x во второй степени = " + x * x);
//        } else System.out.println("x в четвертой степени = " + x * x * x * x);
//        if (y >= 0) {
//            System.out.println("y во второй степени = " + y * y);
//        } else System.out.println("y в четвертой степени = " + y * y * y * y);
//        if (z >= 0) {
//            System.out.println("z во второй степени = " + z * z);
//        } else System.out.println("z в четвертой степени = " + z * z * z * z);

//    }
//
//}

