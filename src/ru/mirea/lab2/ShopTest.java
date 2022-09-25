package ru.mirea.lab2;
import java.util.Scanner;

public class ShopTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt, sz;
        System.out.println("Пожалуйста, введите количество компьютеров в магазине, и общую вместимость.");
        cnt = sc.nextInt();
        sz = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[sz];
        System.out.println("Пожалуйста, введите все компьютеры, которые есть в магазине.");
        for (int i = 0; i < cnt; i++) {
            arr[i] = sc.nextLine();
        }
        Shop mvideo = new Shop(cnt, sz, arr);
        System.out.println(mvideo);
        mvideo.deleteComp("a");
        mvideo.newComp("d");
        System.out.println(mvideo);
    }
}
