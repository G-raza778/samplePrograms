package Section_2;
import java.util.Scanner;
public class Array_1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array length");
	int n1=sc.nextInt();
	int arr[]=new int[n1];
	int n=1;
	
	
	for(int i=0;i<arr.length;i++) {
		
			arr[i]=n++;
		//	System.out.println(arr[i]);	
			int count=0;
	for(int j=1;j<=arr[i];j++) {
			if(arr[i]%j==0) {
				count++;
			}
	}
	if(count==2) {
		System.out.println(arr[i]);
	}
	}
}
}
