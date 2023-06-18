
package Section_3;
import java.util.Scanner;
public class Even_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	try {
	if(num>0) {
	
			if(num%2==0) {
				System.out.println("The enterred number is even number:");
			}
			else {
				System.out.println("Enterred number is odd number:");
			}
		}
	else {
		throw new ArithmeticException();
	}
}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

