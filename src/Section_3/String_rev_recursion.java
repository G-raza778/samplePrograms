package Section_3;

public class String_rev_recursion {


static int i=0;
public static void main(String[] args) {
	m1();
}
public static void m1() {
	String s="string";
	String s1="";
	if(i<=s.length()-1) {
		s1=s1+s.charAt(i);
		i++;
		m1();
	}
	System.out.print(s1);
}

}
