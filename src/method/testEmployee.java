package method;

public class testEmployee {
    public static void main(String[]args){
        employee sawon,shovon;
        sawon = new employee();
        shovon = new employee();

        sawon.bonus = 5;
        sawon.salary = 5;
        int total = sawon.totalSal();
        System.out.println("Total" + total);
    }
}
