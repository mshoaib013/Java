package overloading;

public class TestBox {
	public static void main(String[]args){
		Box obj = new Box();

		obj.area(5);
		obj.area(5,7);
		obj.area(5,5);
		obj.area(5.5);
	}
}
