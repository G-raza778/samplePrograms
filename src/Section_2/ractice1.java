package Section_2;

public class ractice1 {
public static void main(String[] args) {
	String s="abcde";
	String s1="bcdae";
	for(int i=0;i<s.length();i++) {
		for(int j=0;j<s1.length();j++) {
			if(s.charAt(i)==s1.charAt(j)) {
				System.out.println("all characters are present");
			}
		}
	}
}
}
