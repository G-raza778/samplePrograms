package Section_3;

public class String_num_sum {
public static void main(String[] args) {
	String s="s1t2r3i4n5g";
	String s1="";
	int num=0;
	for(int i=0;i<s.length();i++) {
		
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			s1=s1+s.charAt(i);
		}
	}
	System.out.println(s1);
	//num=Integer.parseInt(s1);
	Integer a1=Integer.valueOf(s1);
	num=a1;
	int sum=0;
	int rem=0;
	while(num>0)
	{
		rem=num%10;
		sum+=rem;
		num/=10;
	}
	System.out.println(sum);
	}
}
	


