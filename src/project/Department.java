package project;

public class Department {
	private String deptName;
	private Double budget;
	private int counter = 0;

	private Employee[] emps = new Employee[5];
	public Department(String deptName){
		this.deptName = deptName;
		this.budget = 50000.0;
	}

	public void addEmployee(Employee obj){
		emps[counter] = obj;
		counter++;

		if (obj.getGrade() >= 5 ){
			this.budget += 150000;
		}
		else {
			this.budget +=100000;
		}
	}
	 public void describe(){
		String temp = "Dept Name : " + this.deptName + "/n Budget : " + this.budget;
		System.out.println("Temp" + temp);
	 }
}