package Section_2;

import java.util.Scanner;

public class Mohsinpalidrome {

	public static void main(String[] args) {
		System.out.println("mohsin");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			m1(num);
		}
		public static void m1(int num1) {
			System.out.println(num1);
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
			}
		
		}

}
