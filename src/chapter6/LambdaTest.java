package chapter6;

import java.util.Arrays;

public class LambdaTest {

	public static void main(String[] args) {
		String[] planets = new String[] {"Mercury", "Venus", "Earth",
				"Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		System.out.println(Arrays.toString(planets));
		System.out.println("Sorted in dictionary order:");
		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));
		System.out.println("Sorted by length: ");
		Arrays.sort(planets, (f, s) -> f.length() - s.length());
		System.out.println(Arrays.toString(planets));
	}

}
