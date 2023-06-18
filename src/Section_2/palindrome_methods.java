package Section_2;

import java.util.Scanner;

public class palindrome_methods {
	
	public static void m1(int num1) {
		int rem=0;
		int sum=0;
		
		int temp=num1;
		
		while(num1>0) {
			rem=num1%10;
			sum=(sum*10)+rem;
			num1=num1/10;
			
		}
		if(sum==temp) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not a plaindrome");
		}}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num value");
	int num=sc.nextInt();
	m1(num);
}

}

