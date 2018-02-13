package chapter5;

import java.time.LocalDate;
import java.util.Objects;

public class Employee2 {

	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee2(String n, double s, int year, int month, int day) {
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
	
	public boolean equals(Object otherObject) {
		if(this == otherObject) return true;
		
		if (otherObject == null) return false;
		
		if (getClass() != otherObject.getClass()) return false;
		
		Employee2 other = (Employee2) otherObject;
		
		return Objects.equals(name, other.getName()) && salary == other.getSalary() && 
				Objects.equals(hireDay, other.getHireDay());
	}
	
	public int hashCode() {
		return Objects.hash(name, salary, hireDay);
	}
	
	public String toString() {
		return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
	}
}
