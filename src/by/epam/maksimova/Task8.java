package by.epam.maksimova;
//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int k = 3;
        int sum = 0;
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sum);
    }
}
