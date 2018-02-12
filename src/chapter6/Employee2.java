package chapter6;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee2 implements Comparable<Employee2>{
	
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee2(String n, double s) {
		this.name = n;
		this.salary = s;
		hireDay = new Date();
	}
	
	public String getName() {
		return name;
	}
	
	public Employee2 clone() throws CloneNotSupportedException {
		Employee2 cloned = (Employee2) super.clone();
		
		cloned.hireDay = (Date) hireDay.clone();
		
		return cloned;
	}
	public double getSalary() {
		return this.salary;
	}
	
	public void setHireDay(int year, int month, int day) {
		Date newHireDay = new GregorianCalendar(year, month-1, day).getTime();
		
		hireDay.setTime(newHireDay.getTime());
	}
	
	public void raiseSalary(double byPercent) {
		double raise = this.salary * byPercent / 100;
		this.salary += raise;
	}
	
	public String toString() {
		return "Employee[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
	}
	
	@Override
	public int compareTo(Employee2 other) {
		
		return Double.compare(this.salary, other.salary);
	}
	
	
}
