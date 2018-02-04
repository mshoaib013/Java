package chai;

public class PrepainPackage extends MobilePackage{
	PrepainPackage(){
		monthlyBill = 1050.0;
		operatorName = "Prepaid";
	}
	double monthlyBill;

	double calculateTotalBill(){

		return monthlyBill;
	}
}
