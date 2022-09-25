package ru.mirea.lab2;

public class Circle2 {
    double x;
    double y;
    double r;
    String name;

    public Circle2(double x, double y, double r, String name) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.name = name;
    }

    public double getX() {return x;}

    public void setX(double x) {this.x = x;}

    public double getY() {return y;}

    public void setY(double y) {this.y = y;}

    public double getR() {return r;}

    public void setR(double r) {this.r = r;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double perimetr() {return 2 * Math.PI * this.r;}

    public double square() {return Math.PI * (this.r * this.r);}

    public void compare(Circle2 circle) {
        if (this.r > circle.r) {
            System.out.println("Периметр Круга " + this.getName() + " больше периметра " + circle.getName() + " на " + (this.perimetr() - circle.perimetr()));
            System.out.println("Площадь Круга " + this.getName() + " больше площади " + circle.getName() + " на " + (this.square() - circle.square()));
        }
        else if (this.r < circle.r) {
            System.out.println("Периметр Круга " + this.getName() + " меньше периметра " + circle.getName() + " на " + (circle.perimetr() - this.perimetr()));
            System.out.println("Площадь Круга " + this.getName() + " меньше площади " + circle.getName() + " на " + (circle.square() - this.square()));
        }
        else {
            System.out.println("Круги равны.");
        }
    }

    @Override
    public String toString() {
        return "Circle2{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                ", name='" + name + '\'' +
                '}';
    }
}
