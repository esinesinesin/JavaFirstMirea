package ru.mirea.lab2;

public class Circle2Test {
    public static void main(String[] args) {
        Circle2 firstc = new Circle2(0, 2, 13.1, "first");
        Circle2 secondc = new Circle2(0, -5.44, 10, "second");

        firstc.compare(secondc);
        firstc.setR(1);
        firstc.compare(secondc);
    }
}
