package InheritanceGUI;
public class EmployeeInfo {

	// Attributes
    public String firstName;
    public String lastName;
    public String gender;
    public String workLocation;
    public double deductionRate;
	public int employeeNumber;

    public EmployeeInfo(int eN, String fN, String lN, String g, String wL,double dR) {
        employeeNumber = eN;
        firstName = fN;
        lastName = lN;
        gender = g;
        workLocation = wL;
        deductionRate = dR;
    }
}