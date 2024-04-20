package inheritance;

public class EmployeesalaryB extends EmployeesalaryA{
		double hra;
		double pf;
		public void calc() {
			hra=0.05*basicpay;
			pf=0.20*basicpay;

	}

}
