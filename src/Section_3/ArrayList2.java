package Section_3;

import java.util.ArrayList;

public class ArrayList2 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(11);
	a1.add(13);
	a1.add(14);
	a1.add(15);
	
	System.out.println("the even numbers are:");
	for(int i=0;i<a1.size();i++) {
		Object obj=a1.get(i);
		
		if(obj instanceof Integer ) {
			Integer a=(Integer)obj;
			if(a%2==0) {
				System.out.println(a);
			}
		}
	}
}
}
