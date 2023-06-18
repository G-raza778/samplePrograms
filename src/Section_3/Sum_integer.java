package Section_3;
import java.util.Scanner;
public class Sum_integer {
public static void main(String[] args) {
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the mixed string");
	String s=sc.next();
	//int num=Integer.parseInt(s);
	
	for(int i=0; i<s.length(); i++) {
	//	char ch=(Character)s.charAt(i);
		
		if(s.charAt(i)>0 && s.charAt(i)<9) {
		//	int y=s.charAt(i);
			sum+=Integer.parseInt(s);	
		}
	}
	System.out.println(sum);
}
}
