package Section_3;

public class String121 {
public static void main(String[] args) {
	String s="a1b2c3";
	int sum=0;
	for(int i=0;i<=s.length()-1;i++) {
		if(s.charAt(i)>'0'&&s.charAt(i)<'9') {
			
			sum=sum+(s.charAt(i)-'0');
		}
	}
	System.out.println(sum);
}
}
