package Section_3;
import java.util.Scanner;
//string reverse program.
public class Reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:");
	String s=sc.next();
	String s1="";
	
	for(int i=s.length()-1;i>=0;i--) {
		s1=s1+s.charAt(i);
	}
	System.out.println(s1);
}
}
