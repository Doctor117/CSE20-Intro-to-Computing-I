package lab4;

import java.util.Scanner;

public class Errors1 {

	public static void main(String[] args) {
		//System.out.println("Can you spot and fix the errors?);
		System.out.println("Can you spot and fix the errors?");

		//System.out.println("Enter two numbers and I ");
		System.out.print("Enter two numbers and I will ");
		System.out.println("add them for you.");

		int n1, n2;

		//Scanner keyboard = new Scanner(System.in)
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		//n1 = nextInt();
		n1 = input.nextInt();
		//n2 = nextint();
		n2 = input.nextInt();

		//System.println("The sum of the numbers is");
		System.out.println("The sum of the numbers is");
		//System.out.println(n1 - n2);
		System.out.println(n1+n2);
	}
}