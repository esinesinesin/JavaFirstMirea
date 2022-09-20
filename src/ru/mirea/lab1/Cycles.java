package ru.mirea.lab1;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int x;
        int[] arr = new int[N];
        int summary1 = 0, summary2 = 0;
        for (int i = 0; i < N; i++) {
            x = in.nextInt();
            arr[i] = x;
        }
        int maximum1= arr[0], maximum2 = arr[0];
        int minimum1= arr[0], minimum2 = arr[0];
        int i = 0, j = 0;
        while (i < N) {
            summary1 += arr[i];
            maximum1 = Math.max(maximum1, arr[i]);
            minimum1 = Math.min(minimum1, arr[i]);
            i++;
        }
        do {
            summary2 += arr[j];
            maximum2 = Math.max(maximum2, arr[j]);
            minimum2 = Math.min(minimum2, arr[j]);
            j++;
        }
        while (j < N);

        System.out.println(summary1 + " " + maximum1 + " " + minimum1);
        System.out.println(summary2 + " " + maximum2 + " " + minimum2);
        in.close();
    }
}
