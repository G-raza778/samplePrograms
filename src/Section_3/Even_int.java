package Section_3;

import java.util.ArrayList;

public class Even_int {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(1);
	a1.add(11);
	a1.add(12);
	a1.add(32);
	a1.add(43);
	
	System.out.println("the integer objects are");
	for(int i=0;i<a1.size();i++) {
		Object obj=a1.get(i);
		if(obj instanceof Integer) {
			Integer a=(Integer)obj;
			if(a%2==0) {
				System.out.println(a);
			}
		}
	}
}
}
