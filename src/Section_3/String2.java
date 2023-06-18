package Section_3;
import java.util.Scanner;

public class String2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String :");
	String s1=sc.next();
	int alpha = 0,digits = 0,spl=0;
	for(int i=0;i<s1.length();i++)
	{
	 if (s1.charAt(i)>='a'&&s1.charAt(i)<'z') {
		 alpha++;
	 }
	 else if (s1.charAt(i)>'0'&&s1.charAt(i)<'9')
	 {
		 digits++;
	 }
	 else
	 {
		 spl++;
	 }
	 
	}
	System.out.println("the count of the alphabets are:"+alpha);
	System.out.println("the count of the numbers are:"+digits);
	System.out.println("the count of the special charcaters are:"+spl );
}
}
