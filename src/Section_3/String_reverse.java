package Section_3;

public class String_reverse {
public static void main(String[] args) {
	String s="i love string";
	String s1="";
	String s2[]=s.split(" ");
	
	for(int i=0;i<s2.length;i++) {
		String s3=s2[i];
		for(int j=s3.length()-1; j>=0; j--)
		{
			s1=s1+s3.charAt(j);
		}
		s1=s1+" ";	
	}
	System.out.println(s1);
}
}
