package InheritanceGUI;
public class PTE extends EmployeeInfo {
	
	public double hourlyWage;
	public double weeklyHours;
	public double weekPerYear;
	
	
	public PTE(int eN, String fN, String lN, String g, String wL, double dR, double hW, double wH, double wPY) {
		super(eN, fN, lN, g, wL, dR);
		hourlyWage = hW;
		weeklyHours = wH;
		weekPerYear = wPY;
	}
	
	public double calcNetIncome() {
		return hourlyWage*weeklyHours*weekPerYear*(1-deductionRate);
	}
	
}