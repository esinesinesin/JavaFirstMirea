package ru.mirea.lab2;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String newLine = sc.nextLine();
        while (!newLine.isEmpty()) {
            cnt += count(newLine);
            newLine = sc.nextLine();
        }
        System.out.println(cnt);
    }
    public static int count(String str) {
        int ans = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length-1; i++) {
            if (Character.isLetter(chars[i]) & !Character.isLetter(chars[i+1])) {
                ans += 1;
            }
        }
        if (Character.isLetter(chars[chars.length-1])) {
            ans += 1;
        }
        return ans;
    }
}
