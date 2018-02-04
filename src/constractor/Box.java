package constractor;

public class Box {
	int width;
	int length;

	void area(){
		int area = width*length;
		System.out.println(area);
	}

/*Constractor : Used to set default values
  *Fired when object created
  * For each object created constractor will be fired(can be many times)
  * Constractor will be fired equal to object created
  *same name with class name
*/
	Box(){
		this.width = 5;
		this.length = 5;
		System.out.println("Constractor Fired");
	}

	Box(int length,int width){
		int area = length*width;
		System.out.println(area);
	}
}
