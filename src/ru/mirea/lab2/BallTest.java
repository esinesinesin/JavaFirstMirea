package ru.mirea.lab2;
import java.util.Scanner;

public class BallTest {
    public static void main(String[] args) {
        double x1=0.05, y1=-1.12, x2, y2;
        Ball myach = new Ball(0, 0);
        System.out.println(myach);
        myach.setX(7.45);
        myach.move(0, 1.1234);
        System.out.println(myach);
        Scanner sc = new Scanner(System.in);
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        myach.setXY(x2, -y2);
        System.out.println(myach);
    }
}
