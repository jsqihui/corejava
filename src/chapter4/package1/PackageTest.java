package chapter4.package1;

import chapter4.package2.Employee4;

import static java.lang.System.out;

public class PackageTest {

	public static void main(String[] args) {
		Employee4 harry = new Employee4("Harry Hacker", 50000, 1989, 10, 1);
		
		harry.raiseSalary(5);
		
		out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
	}

}
