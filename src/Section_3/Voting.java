package Section_3;

import java.util.Scanner;

class Voting{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		try
		{
			if (age>=18) {
				throw new YoungerAgeException("You are eligible to vote");
			}
			else
			{
				System.out.println("you are not eligible to vote");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
