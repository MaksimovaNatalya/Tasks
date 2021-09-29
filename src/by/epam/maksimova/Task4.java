package by.epam.maksimova;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int x, y;
        System.out.println("Введите координаты x и y через enter");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();

        if((x>=-4) && (x<=4) && (y>=-3) && (y<=0)) {
            System.out.println("TRUE");}
        else if((x>=-2) && (x<=2) && (y>=0) && (y<=4)){
            System.out.println("TRUE");
        } else
            System.out.println("FALSE");
        }
    }

