package chapter6;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private double salary;
	
	public Employee(String n, double s) {
		this.name = n;
		this.salary = s;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = this.salary * byPercent / 100;
		this.salary += raise;
	}

	@Override
	public int compareTo(Employee other) {
		
		return Double.compare(this.salary, other.salary);
	}
	
	
}
