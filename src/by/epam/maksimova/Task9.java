package by.epam.maksimova;
//  Заданы два одномерных массива с различным количеством элементов и натуральное число k.
//  Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого.

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {

        int k = 3;
        int j = 0;
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int[] b = new int[]{7, 8, 9, 0};

        int[] sum = new int[(a.length + b.length)];
        for (int i = 0; i < sum.length; i++) {
            if ((k + 1) > i) {
                sum[i] = a[i];
            } else if (j < k + 1) {
                sum[i] = b[j];
                j++;
            } else
                sum[i] = a[i - k - 1];
        }

        System.out.print(Arrays.toString(sum));

    }
}
