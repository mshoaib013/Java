package Abstract;

public class SquareContainer extends Container{

	@Override
	double calculateAreaOfBase(int length) {
		double area = length*length;
		System.out.println(area);
		return area;
	}
}
