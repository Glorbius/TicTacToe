package kz.tictactoe.scan;

import java.util.Scanner;

public class Scaner {


    public static int getX () {
        Scanner scanx = new Scanner(System.in);
        System.out.println("Введите координату X");
        System.out.println(": ");
        int x = scanx.nextInt()-1;
        return x;
    }

    public static int getY () {
        Scanner scany = new Scanner(System.in);
        System.out.println("Введите координату Y");
        System.out.println(": ");
        int y = scany.nextInt()-1;
        return y;

    }
}
