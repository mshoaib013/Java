package Static;

public class ExampleStatic {
	/*
	 *Static is one per class /
	 * Not one per object
	 * create new object is like new template for nonstatic
	 * but creating new object is not like new template for static method
	 */

	static int staticVariable;
	int nonStaticVariable;

	//Static method
	static public void staticMethod(){
		System.out.println("Static variable = " + staticVariable);
		staticVariable++;
	}

	public void nonStaticMethod(){
		System.out.println("Non Static Variable is : " + nonStaticVariable);
		nonStaticVariable++;
	}

	static {
		System.out.println("Static Block of code");
	}

	ExampleStatic(){
		System.out.println("Constructor Fired ");
	}
}
