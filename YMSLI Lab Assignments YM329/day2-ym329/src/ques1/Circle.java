package ques1;

public class Circle{
    private double radius;
    private String color="Red";
    public Circle() {
        this.radius=1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }
}
