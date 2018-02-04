package project;

public class TestCompany {
	public static void main(String[]args){
		Employee alex = new Employee("Alex",6);
		Employee linda = new Employee("Linda",7);
		Employee john = new Employee("John",3);

		Employee sara = new Employee("Sara",7);
		Employee james = new Employee("James",4);

		Department sales = new Department("XYZ Sales");
		Department IT = new Department("XYZ IT");

		sales.addEmployee(alex);
		sales.addEmployee(linda);
		sales.addEmployee(john);

		IT.addEmployee(sara);
		IT.addEmployee(james);

		sales.describe();
		IT.describe();
	}
}
