package Section_2;

import java.util.Scanner;

public class Recursion_prime {
	static int count=0,i=1;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	m1(num);
}
public static void m1(int num) {
	Recursion_prime a1=new Recursion_prime();
	if(i<=num) {
		if(num%i==0) {
			count++;
		}
		if(count==0) {
			System.out.println(i);
		}
		i++;
		m1(num);
	}
}
}
