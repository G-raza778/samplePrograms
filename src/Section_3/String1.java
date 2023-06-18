package Section_3;

public class String1 {
public static void main(String[] args) {
	String s1="QSPIDERS";
	String s2="mohana";
	String s3="kalyani123";
	String s4="Hi everyone how are you";
	
	System.out.println("to find the length of the String s1: "+s1.length());
	System.out.println("to find the characters from the string :");
	for (int i=0;i<s1.length();i++)
	{
		System.out.println(s1.charAt(i));
	}
	System.out.println("to find given string in given array");
	char[]arr=s2.toCharArray();
	for (int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println("to find the index of 'q' in s1:"+s1.indexOf('Q'));
	System.out.println("to find the last index of the 's' is:"+s1.lastIndexOf('S'));
	System.out.println("to find the substring of s1 is:"+s1.substring(2));
	System.out.println("the substring of the s2 is :"+s2.substring(2,6));
	System.out.println("the substring of the s4:"+s4.substring(0,10));
	System.out.println("does s1 contains ders :"+s1.contains("DERS"));
	System.out.println("convert s1 to lowercase :"+s1.toLowerCase());
	System.out.println("convert s4 to uppercase :"+s4.toUpperCase());
	System.out.println("to concat s2 and s3 :"+s2.concat(s3));
//	System.out.println("the split array of string is :");
//	for (int i=0;i<str.length();i++)
//	{
//		System.out.println(str[i]);
//	}
}
}
