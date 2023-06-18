package Section_3;
//ascii value addition of String.
public class ASCII_Value {
	
	public static void main(String[] args) {
		
		String s="abc";
		int asciivalue, result=0;
		
		for (int i=0; i<s.length(); i++)
		{
			asciivalue=s.charAt(i);
			result+=asciivalue;
		}
		System.out.println(result);
	}

}
