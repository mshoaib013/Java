package oop;
public class Fcuk {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(15);
        System.out.println("Circle 1:" + "\n Radius:" + c1.radius + "\n Area: " + c1.getArea() + "\n Circumference: " + c1.getCircumference());

        System.out.println("Circle 2:\n Radius:" + c2.radius + "\n Area: " + c2.getArea() + "\n Circumference: " + c2.getCircumference());

        refTest(c1, c2);

        System.out.println("\nAfter reference test");

        System.out.println("Circle 1:\n Radius:" + c1.radius + "\n Area: " + c1.getArea() + "\n Circumference: " + c1.getCircumference());

        System.out.println("Circle 2:\n Radius:" + c2.radius + "\n Area: " + c2.getArea() + "\n Circumference: " + c2.getCircumference());

    }

    //Taste Referencing
    public static void refTest(Circle circle1, Circle circle2) {
        circle2.radius = circle1.radius;
    }
}