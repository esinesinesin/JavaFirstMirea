package ru.mirea.lab2;
import java.util.Scanner;

public class AuthorTest {
    public static void name(String[] args) {
        String name = "Ilya";
        String email = "email@gmail.com";
        char gender = 'M';
        Author Me = new Author(name, email, gender);
        System.out.println(Me);
    }
}
