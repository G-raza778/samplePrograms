package Section_3;

public class Number_String {
public static void main(String[] args) {
	String s="5";
	int fact=1;
	int s1=Integer.parseInt(s);
	for(int i=1;i<=s1;i++) {
		fact=fact*i;
	}
	System.out.println(fact);
}
}
