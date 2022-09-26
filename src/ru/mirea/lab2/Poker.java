package ru.mirea.lab2;
import java.util.Scanner;
import java.util.Random;

public class Poker {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        String[] suits = new String[]{"Diamonds", "Hearts", "Spades", "Clubs"};
        String[] ranks = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] cards = new String[52];
        String[] onTable = new String[52];

        for (String i : suits) {
            for (String j : ranks) {
                cards[count] = j + " of " + i;
                count += 1;
            }
        }

        for (int i = 0; i < n; i++) {
            String hand = "";
            for (int j = 0; j < 5; j++) {
                while (true) {
                    int ind = (int)(Math.random()*52);
                    if (onTable[ind] == null) {
                        hand += cards[ind] + "  ";
                        onTable[ind] = cards[ind];
                        break;
                    }
                }
            }
            System.out.println(hand);
        }
    }
}
