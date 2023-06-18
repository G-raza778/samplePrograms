package Section_3;
import java.util.Scanner;
//words count
public class String5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Sentence:");
	String s=sc.nextLine();
	
	String[]s1=s.split(" ");
	int count=0;
	for(int i=0;i<s1.length;i++)
	{
		
		count++;
	}
	System.out.println(count);
}
}
