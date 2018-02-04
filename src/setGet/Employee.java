package setGet;

public class Employee {
	private int salary;
	int bonus;
	public void setSalary(int salary) {
		if (salary>100 && salary<1000){
			this.salary = salary;
		}
		else {
			this.salary=0;
			System.out.println("Stay within range");
		}
	}

	public int getSalary() {
		return salary;
	}

	int totalPay(){
		return(salary+bonus);
	}


}
