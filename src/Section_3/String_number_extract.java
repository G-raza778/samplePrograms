package Section_3;

public class String_number_extract {
public static void main(String[] args) {
	String s="gulam123@";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
			System.out.print(s.charAt(i));
		}
	}
}
}
