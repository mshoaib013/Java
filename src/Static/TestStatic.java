package Static;

public class TestStatic {
	public static void main(String[]args){
		ExampleStatic obj = new ExampleStatic();
		obj.nonStaticMethod();
		obj.nonStaticMethod();
		obj.staticMethod();
		obj.staticMethod();

		ExampleStatic obj2 = new ExampleStatic();
		obj2.nonStaticMethod();
		obj2.nonStaticMethod();
		obj2.staticMethod();
		obj2.staticMethod();
		obj2.staticMethod();

		ExampleStatic.staticMethod();
		ExampleStatic.staticMethod();

		//We cannot call non static method directly like this
		//ExampleStatic.nonStaticMethod();
	}
}
