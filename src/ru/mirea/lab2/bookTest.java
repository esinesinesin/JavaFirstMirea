package ru.mirea.lab2;

public class bookTest {
    public static void main(String[] args) {
        Book Bible = new Book("Bible", "God", "religion", "None", 0, 1000);
        Book War_and_Peace = new Book("War_and_Peace", "Tolstoy", "classic", "None", 1800, 1000);
        Book First = new Book("F", "God", "religion", "None", 1600, 1000);
        Book Second = new Book("Bible", "God", "religion", "None", 1000, 1000);
        System.out.println(Bible);
        Bible.setPrice(2000.222);
        System.out.println(Bible.getPrice());
        Book[] testtest = new Book[] {Bible, War_and_Peace, First, Second};

        Bookshelf first = new Bookshelf(4, testtest);
        System.out.println(first.books[1]);
        System.out.println(first.youngest());
        System.out.println(first.oldest());
    }
}
