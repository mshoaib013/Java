package chai;

public abstract class MobilePackage {
	String operatorName;
	double totalBill;
	abstract double calculateTotalBill();
	void tString(){
		System.out.println(operatorName);
		System.out.println(calculateTotalBill());
	}
}
