package ru.mirea.lab1;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int x;
        int[] arr = new int[N];
        double summary = 0;
        double average;
        for (int i = 0; i < N; i++) {
            x = in.nextInt();
            arr[i] = x;
            summary += x;
        }
        average = summary / arr.length;
        System.out.println((int)summary);
        System.out.println((summary/arr.length));
        in.close();
    }
}

