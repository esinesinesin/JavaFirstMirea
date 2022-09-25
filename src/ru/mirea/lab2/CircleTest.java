package ru.mirea.lab2;
import java.util.Scanner;
import java.lang.*;

public class CircleTest {
    public static void main(String[] args) {
        int N;
        Point p = new Point(0, 0);
        Circle a = new Circle(p);
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Circle[] arr = new Circle[N];
        for (int i = 0; i < N; i++) {
            Point s = new Point(sc.nextDouble(), sc.nextDouble());
            arr[i] = new Circle(s);
        }
        for (Circle c : arr) {
            System.out.println(c);
        }
        arr[2].newCentre(0.05, -5.555);
        System.out.println(arr[2]);
    }
}
