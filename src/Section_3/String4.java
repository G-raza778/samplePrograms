package Section_3;
import java.util.Scanner;
public class String4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String :");
	String s=sc.next();
	int s1=0;
	for (int i=0;i<s.length();i++)
	{
		int ch=s.charAt(i);
		s1=s1+ch;
	}
	System.out.println(s1);
	
}
}
