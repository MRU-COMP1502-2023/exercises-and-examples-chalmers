package staticKeyword;

public class Employee {
	
	private static String companyName;
	private String name;
	
	public Employee(String name) {
		companyName = "Spacely Sprockets";
		this.name = name;
	}

	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	public String toString() {
		return name + " works for " + companyName;
	}

}
