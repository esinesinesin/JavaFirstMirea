package ru.mirea.lab2;

public class Circle {
    Point centre = new Point(0, 0);

    public Circle(Point centre) {
        this.centre = centre;
    }

    public void newCentre(double x, double y) {
        this.centre = new Point(x, y);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centre = " + centre +
                '}';
    }
}
