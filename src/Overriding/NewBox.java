package Overriding;

public class NewBox {
	
	void area(int width, int length){

		/*
		 *When a method in the Subclass have the same signature as a method in the super class
		 * Overloading used to modify or correction main method
		 * Then the subclass method take precedence
		 *
		 */
		int area = width*length;
		System.out.println("Fired Sub Class & Area is : " + area);
	}
}
