package chapter3;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// get first input
		System.out.println("What is your name? ");
		String name = in.nextLine();
		
		// get second input
		System.out.println("How old are you? ");
		int age = in.nextInt();
		
		// display output on console
		System.out.println("Hello, " + name + ", next year, you will be " + (age + 1));
		
		// Added by @HUI
		in.close();

	}

}
