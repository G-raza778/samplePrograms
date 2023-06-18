package Section_3;
import java.util.Scanner;
public class Array1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//String s= "abc_de";
	System.out.println("Enter the String");
	String s=sc.nextLine();
	char[]arr=s.toCharArray();
	int j=arr.length-1;
	
	for(int i=0;i<=arr.length;i++)
	{
	//System.out.print(arr[i]+" ");
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	System.out.println(arr[j]);
}
}
