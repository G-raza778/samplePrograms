package Section_3;
import java.util.Scanner;
public class String3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the String:");
	String s=sc.next();
	String s1="";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if (s1.indexOf(ch)<0)
		{
			s1=s1+ch;
		}
	}
	System.out.println(s1);
}
}
