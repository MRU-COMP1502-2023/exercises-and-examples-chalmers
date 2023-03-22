package staticKeyword;

public class StaticDemo {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("timmy");
		Employee employee2 = new Employee("john");
		Employee employee3 = new Employee("mark");
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		
		employee1.setCompanyName("Acme");
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		
		
		WebData wd1 = new WebData();
		WebData wd2 = new WebData();
		
		System.out.println(wd1.data);
		System.out.println(wd2.data);
		
	}

}
