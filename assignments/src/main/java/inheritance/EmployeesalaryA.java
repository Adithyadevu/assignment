package inheritance;
import java.util.*;

public class EmployeesalaryA {
	double basicpay;
	float deduction;
	int bonus;
	public void dis(){
		System.out.println("Enter basicpay of the Employee:");
		Scanner obj1=new Scanner(System.in);
		basicpay=obj1.nextDouble();
		System.out.println("Enter the deduction:");
		Scanner obj2=new Scanner(System.in);
		deduction=obj2.nextFloat();
		System.out.println("Enter bonus:");
		Scanner obj3=new Scanner(System.in);
		bonus=obj3.nextInt();
		
	}
}
