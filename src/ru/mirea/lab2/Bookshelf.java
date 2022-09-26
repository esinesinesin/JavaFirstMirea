package ru.mirea.lab2;

public class Bookshelf {
    int n;
    Book[] books = new Book[n];

    public Bookshelf(int n, Book[] books) {
        this.n = n;
        this.books = books;
    }

    public void sortedYear() {
        for (int i = 0; i < this.n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (this.books[j].getYear() < this.books[min_index].getYear()) {
                    min_index = j;
                }
            }
            Book help = this.books[min_index];
            this.books[min_index] = this.books[i];
            this.books[i] = help;
        }
    }

    public Book oldest() {
        this.sortedYear();
        return books[n-1];
    }

    public Book youngest() {
        this.sortedYear();
        return books[0];
    }
}
