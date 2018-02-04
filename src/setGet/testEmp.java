package setGet;

public class testEmp {
	public static void main(String[]args){
		Employee alex = new Employee();
		alex.setSalary(2000);
		alex.bonus = 20;
		System.out.println(alex.totalPay());
		System.out.println(alex.getSalary());
	}

}
