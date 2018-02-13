package chapter5;

import java.time.LocalDate;

public class Employee1 extends Person {

	private double salary;
	private LocalDate hireDay;
	
	public Employee1(String n, double s, int year, int month, int day) {
		super(n);
		this.salary = s;
		this.hireDay = LocalDate.of(year, month, day);
	}
	
	
	public double getSalary() {
		return this.salary;
	}
	
	public LocalDate getHireDay() {
		return this.hireDay;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = this.salary * byPercent / 100;
		this.salary += raise;
	}


	@Override
	public String getDescription() {
		
		return String.format("an employee with a salary of $%.2f", this.salary);
	}
}
