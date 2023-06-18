package Section_3;
import java.util.Scanner;
public class String6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String number");
	String num=sc.next();
	
	//int i=Integer.parseInt(num);
	
	Integer a=Integer.valueOf(num);
	int i=a;
	
	System.out.println(i);
	int rem=0,sum=0;
	while(i>0) {
		rem=i%10;
		System.out.println(rem);
		i=i/10;
		sum=sum+rem;
	}

	System.out.println("the sum of the digits of the number string is:"+sum);
	
}
}
