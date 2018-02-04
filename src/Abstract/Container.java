package Abstract;

public abstract class Container {
	/*
	 *Abatract is a class which has Fully defined method and empty method
	 * Empty method must have keyword abstract
	 * and the class contain abstact method must have keyword abstract
	 */
	public void calculateVolume(int length,int height){
		double volume = calculateAreaOfBase(length)*height;
		System.out.println(volume);
	}
	abstract double  calculateAreaOfBase(int length);
}
