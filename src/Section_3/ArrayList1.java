package Section_3;

import java.util.ArrayList;

public class ArrayList1 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(2.5);
	a1.add("aam");
	a1.add('a');
	a1.add(3.5);
	a1.add(10.5);
	a1.add(15);
	a1.add('@');
	System.out.println("the double objects are:");
	
	for(int i=0;i<a1.size();i++) {
		Object obj=a1.get(i);
		if(obj instanceof Double) {
			System.out.println(obj);
		}
	}
	int count=0;
	for(int i=0;i<a1.size();i++) {
		Object obj=a1.get(i);
		if(obj instanceof Character) {
			
			count++;
		}
	}
	System.out.println("the number of characters are :"+count);
}
}
