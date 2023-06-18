package Section_3;

public class String_duplicate {
public static void main(String[] args) {
	String s="sttrriing";
	char[]arr=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<s.length();j++) {
			if(arr[i]==arr[j]) {
			System.out.println(arr[j]);
			}
		}

	}
	
}
}
