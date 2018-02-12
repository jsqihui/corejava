package chapter6;

public class CloneTest {

	public static void main(String[] args) {
		try {
			Employee2 original = new Employee2("John Public", 50000);
			original.setHireDay(2000, 1, 1);
			Employee2 copy = original.clone();
			copy.raiseSalary(10);
			System.out.println("original="+original);
			System.out.println("copy="+copy);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
