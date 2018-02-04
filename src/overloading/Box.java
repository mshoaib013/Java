package overloading;

public class Box {
	void area(int length,int width){
		System.out.println("Area is : " + length*width);
	}
	void area(double length,double width){
		System.out.println("Area of Double is : " + length*width);
	}
	void area(int length){
		System.out.println("Square area : " + length*length);
	}
	void area(double circle){
		System.out.println(circle*circle);
	}
}
