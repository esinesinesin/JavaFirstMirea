package ru.mirea.lab2;

public class Book {
    String title;
    String author;
    String genre;
    String publisher;
    int year;
    double price;

    public Book(String title, String author, String genre, String publisher, int year, double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getAuthor() {return author;}

    public String getGenre() {return genre;}

    public void setGenre(String genre) {this.genre = genre;}

    public void setAuthor(String author) {this.author = author;}

    public String getPublisher() {return publisher;}

    public void setPublisher(String publisher) {this.publisher = publisher;}

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

