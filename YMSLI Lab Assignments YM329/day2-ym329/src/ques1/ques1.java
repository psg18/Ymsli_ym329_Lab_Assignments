package ques1;

public class ques1 {

    public static void main(String[] args) {
        
        Circle circle = new Circle();
        System.out.println("Object Using Default Constructor");
        System.out.println("Radius: "+circle.getRadius()+" Area: "+circle.getArea());
        Circle circle2 = new Circle(4.0);
        System.out.println("Object Using Parameterised Constructor");
        System.out.println("Radius: "+circle2.getRadius()+" Area: "+circle2.getArea());
        
    }

}