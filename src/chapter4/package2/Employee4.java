package chapter4.package2;

import java.time.LocalDate;

public class Employee4 {
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee4(String n, double s, int year, int month, int day) {
		this.name = n;
		this.salary = s;
		this.hireDay = LocalDate.of(year, month, day);
	}
	
	public String getName() {
		return name;
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
}
