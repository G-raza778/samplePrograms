package Section_2;

import java.util.Scanner;

class Child2 extends Child1
{
	public Child2 (int num)
	{
		super(num);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num  =sc.nextInt();

		Child2 obj = new Child2(num);
	}
}

