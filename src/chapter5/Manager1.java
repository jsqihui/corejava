package chapter5;

public class Manager1 extends Employee2{
	private double bonus;
	
	public Manager1(String n, double s, int year, int month, int day) {
		super(n, s, year, month, day);
		bonus = 0;
	}
	
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	
	public void setBonus(double b) {
		bonus = b;
	}
	
	public double getBonus() {
		return this.bonus;
	}
	
	public boolean equals(Object otherObject) {
		if(!super.equals(otherObject)) return false;
		
		Manager1 other = (Manager1) otherObject;
		
		return bonus == other.getBonus();
	}
	
	public int hashCode() {
		return super.hashCode() + 17 * new Double(bonus).hashCode();
	}
	
	public String toString() {
		return super.toString() + "[bonus=" + bonus + "]";
	}
}
