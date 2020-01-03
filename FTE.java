package InheritanceGUI;
public class FTE extends EmployeeInfo {
	
	public double annualSalary;
	
	public FTE(int eN, String fN, String lN, String gender, String workLocation, double dR, double aS) {
		super(eN, fN, lN, gender, workLocation, dR);
		annualSalary = aS;
	}
	
	public double calcNetIncome() {
		return annualSalary*(1-deductionRate);
	}
}
