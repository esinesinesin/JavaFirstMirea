package ru.mirea.lab2;
import java.util.Scanner;
import java.util.ArrayList;

public class DogPitomnik {
    public static void main(String[] args) {
        ArrayList<Dog> Pitomnik = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько собак вы хотите добавить в питомник?");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            Dog dog = new Dog(name, age);
            Pitomnik.add(dog);
        }
        for (Dog d : Pitomnik) System.out.println((d));
        System.out.println(Pitomnik.get(2).humanAge());
    }
}
