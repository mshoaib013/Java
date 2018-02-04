package chai;

public class PostpaidPackage extends MobilePackage {
	double perMinuteRate;
	double totalMinutes;
	PostpaidPackage(){
		perMinuteRate = 0.5;
		totalMinutes = 150.0;
		operatorName = "Postpaid";
	}


	double calculateTotalBill(){
		//return totalBill*totalMinutes;
		double temp = totalMinutes*perMinuteRate;
		return temp;
	}
}
