package Section_2;
import java.util.Scanner;
public class Non_static {
public static int m1() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	return num;
}
public void m2(int num) {
	int sum=0;
	for (int i=1;i<=num;i++)
	{
		if (num%i==0)
		{
			sum=sum+i;
		}
	}
	if (sum==num) {
		System.out.println("the enterred number is perfect number ");
	}
	else {
		System.out.println("the enterred number is not a perfect number");
	}
}
public static void main(String[] args) {
	Non_static a1=new Non_static();
	int n1=Non_static.m1();
	a1.m2(n1);
}
}
