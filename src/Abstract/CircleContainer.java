package Abstract;

public class CircleContainer extends Container{

	@Override
	double calculateAreaOfBase(int length) {
		double area = Math.PI * (length/2) * (length/2);
		System.out.println(area);
		return area;
	}
}
