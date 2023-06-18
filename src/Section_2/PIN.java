package Section_2;
import java.util.Scanner;
public class PIN {
public static double m1() {
Scanner sc=new Scanner(System.in);
System.out.println("enter the PIN number");
int n1=sc.nextInt();
if (n1==1234) {
	//return n1;
}
return n1;
}
public void m2(double n1) {
	Scanner sc=new Scanner(System.in);
	System.out.println("your current balance is :5000");
	System.out.println("enter the debiting amount:");
	int n2=sc.nextInt();
	if(n2<5000) {
		System.out.println("recieve the cash");
		int n3=5000-n2;
		System.out.println("your remaining balance is:"+n3);
	}
	else {
		System.out.println("pls enter less amount");
	}
}
public static void main(String[] args) {
	PIN a1=new PIN();
	double n4=PIN.m1();
	a1.m2(n4);
	
}
}