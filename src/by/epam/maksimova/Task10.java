package by.epam.maksimova;

public class Task10 {

    public static void main(String[] args) {
        int n = 6;
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i = i + 2) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j + 1;
                array[i + 1][j] = array[i].length - j;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
}
