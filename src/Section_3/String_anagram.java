package Section_3;

public class String_anagram {
public static void main(String[] args) {
	String s="army";
	String s1="mary";
	for(int i=0;i<=s.length();i++) {
		for(int j=0;j<=s1.length();i++) {
			if(s.charAt(i)==s1.charAt(j)) {
				System.out.println("its a anagram");
			}
			else {
				System.out.println("its not");
			}
		}
	}
}
}
