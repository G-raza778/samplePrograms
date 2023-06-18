package Section_3;

public class string_seq {
public static void main(String[] args) {
	String s="abcdef";
	System.out.println("the sequence is");
	for(int i=0;i<s.length();i++) {
		if(i%2==1) {
			System.out.print(s.charAt(i));
		}
	}
}
}
