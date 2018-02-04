package oop;
public class Circle {

    //Defining Attributes

    double radius;//Defining Constructor
    public Circle() {

        radius = 5;
    }

    //Constructor Overloading
    public Circle(double newRadius) {

        radius = newRadius;
    }

    //Defining Methods
    public double getArea() {

        return Math.PI * radius * radius;
    }

     public double getCircumference() {

        return 2 * Math.PI * radius;
     }
}