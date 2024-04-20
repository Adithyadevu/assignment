package inheritance;

public class EmployeesalaryC extends EmployeesalaryB{
	double totalsalary;
public void salary() {
 totalsalary=basicpay+hra-pf-deduction+bonus;
}	
public void salaryslipprint() {
	System.out.println("Salaray slip:");
    System.out.println("Basicpay: " + basicpay);
    System.out.println("Deduction: " + deduction);
    System.out.println("HRA: " + hra);
    System.out.println("Provident Fund: " +pf);
    System.out.println("Bonus: " +bonus);
    System.out.println("Total salary by hand: " +totalsalary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeesalaryC obj=new EmployeesalaryC();
obj.dis();
obj.calc();
obj.salary();
obj.salaryslipprint();

	}

}
