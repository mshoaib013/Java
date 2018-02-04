package Overriding;

public class Box {
	int width;
	int length;

	void area(int width, int length){
		int area = width*length;
		System.out.println("Fired Super Class & Area is : " + area);
	}
}
