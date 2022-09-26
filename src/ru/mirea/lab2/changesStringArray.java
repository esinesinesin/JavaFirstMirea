package ru.mirea.lab2;
import java.util.Scanner;
public class changesStringArray {
    public static void main(String[] args) {
        int N;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        in.nextLine();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextLine();
        }
        Swap(arr);
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void Swap(String[] str) {
        for (int i = 0; i < str.length / 2; i++) {
            String help = str[i];
            str[i] = str[str.length - 1 - i];
            str[str.length - 1 - i] = help;
        }
    }
}
