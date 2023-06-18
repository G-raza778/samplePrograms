package Section_3;

public class String_duple_remove {
public static void main(String[] args) {
	String s="cceenccnaa";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==s.charAt(i+1)) {
			System.out.println(s.charAt(i));
		}
	}
}
}
