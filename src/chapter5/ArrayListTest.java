package chapter5;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Employee2> staff = new ArrayList<Employee2>();
		
		staff.add(new Employee2("Carl Cracker", 75000, 1987, 12, 15));
		staff.add(new Employee2("Harry Hacker", 50000, 1989, 10, 1));
		staff.add(new Employee2("Tony Tester", 40000, 1990, 3, 15));
		
		// raise everyon's salary by 5%
		for(Employee2 e: staff) {
			e.raiseSalary(5);
		}
		
		for(Employee2 e: staff) {
			System.out.println("name=" + e.getName() + ",salary" + e.getSalary() + ",hireDay=" + e.getHireDay());
		}
	}

}
