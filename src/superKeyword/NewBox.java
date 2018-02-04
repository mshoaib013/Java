package superKeyword;

public class NewBox extends Box{
	public int length,height;
	Box obj = new Box();
	public int calculateVolume(int length, int height,int width){

		/*
		 *both are same process super/create obj
		 * but super is easy to use for single purpose
		 * but the condition is subclass must extend superclass to use super keyword
		 */


		//int volume = obj.calculateArea(length,height)*width;
		int volume = super.calculateArea(length, height)*width;
		return volume;
	}
}
