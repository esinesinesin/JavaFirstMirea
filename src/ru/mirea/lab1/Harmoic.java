package ru.mirea.lab1;

public class Harmoic {
    public static void main(String[] args) {
        double ans = 0.0;
        for (int i = 1; i < 11; i++) {
            double x = 1.0 / i;
            ans += x;
            System.out.printf("%.2f ", x);
        }
        System.out.printf("%.2f ", ans);
    }
}
