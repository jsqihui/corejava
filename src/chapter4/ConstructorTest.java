package chapter4;

import java.util.Random;

public class ConstructorTest {

	public static void main(String[] args) {
		Employee3[] staff = new Employee3[3];
		
		staff[0] = new Employee3("Harry", 40000);
		staff[1] = new Employee3(60000);
		staff[2] = new Employee3();
		
		for (Employee3 e:staff) {
			System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
		}
	}

}

class Employee3 {
	
	private static int nextId;
	
	private int id;
	private String name = "";
	private double salary;
	
	// static initialization block
	static
	{
		Random generator = new Random();
		nextId = generator.nextInt();
	}
	
	// object initialization block
	{
		id = nextId;
		nextId++;
	}
	
	// three overloaded constructors
	public Employee3(String n, double s) {
		this.name = n;
		this.salary = s;
	}
	
	public Employee3(double s) {
		this("Employee #" + nextId, s);
	}
	
	public Employee3() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId() {
		this.id = nextId;
		nextId++;
	}
	
	public static int getNextId() {
		return nextId;
	}
	
	public static void main(String[] args) {
		Employee1 e = new Employee1("Harry", 50000);
		System.out.println(e.getName() + " " + e.getSalary());
	}
}
