package This;

public class Box {
	int boxLength;
	int boxWidth;

	void boxArea(int boxLength){
		int boxArea = boxLength * boxWidth;
		//this.boxLength = boxLength;
		System.out.println(boxArea);
	}

	void area (){
		System.out.println(boxLength*boxWidth);
	}
}
