package lab4;
import java.util.Scanner;

public class Interview {

	public static void main(String[] args) 
	{
		System.out.println("Hello, I am Christopher. Please answer the following questions: ");
		System.out.println("");
		
		Scanner input = new Scanner(System.in);
		
		String s1, s2, s3, s4, s5;
		
		System.out.println("What is your name?");
		s1 = input.next();
		System.out.println("Their name is " + s1);
		System.out.println("");
		
		
		System.out.println("What do you like to do on your free time, " + s1 + "?");
		s2 = input.next();
		System.out.println("They like to " + s2 + " on their free time!");
		System.out.println("");
		
		System.out.println("What is your favorite shoe brand?");
		s3 = input.next();
		System.out.println("Their favorite shoe brand is " + s3);
		System.out.println("");
		
		System.out.println("What is your favorite sports team?");
		s4 = input.next();
		System.out.println("Their favorite sports team is the " + s4);
		System.out.println("");
		
		System.out.println("How many siblings do you have?");
		s5 = input.next();
		System.out.println("They have " + s5 + " sibling(s). WOW!");
		System.out.println("");
		
	}

}
