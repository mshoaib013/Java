package Implement;

public class TestOffice {
	public static void main(String[]args){
		/*
		* once a object is created can use again and again
		* Its not mandatory
		 */
		Office obj1 = new Word();
		obj1.Save();
		obj1 = new Excel();
		obj1.Open();
	}
}
