package Abstract;

public class TestContainer {
	public static void main(String[]args){
		CircleContainer obj1 = new CircleContainer();
		obj1.calculateVolume(10,5);

		SquareContainer obj2 = new SquareContainer();
		obj2.calculateVolume(10,5);
	}
}
