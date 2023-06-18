package Section_3;

import java.util.ArrayList;

public class ArrayList_obj {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(1);
	a1.add(1.21);
	a1.add(2.1);
	a1.add(2.31);
	a1.add(1);
	a1.add(32);
	a1.add('a');
	a1.add('@');
	a1.add('b');
	
	System.out.println("the double objects are");
	for(int i=0;i<a1.size();i++) {
		Object obj=a1.get(i);
		if(obj instanceof Double) {
			System.out.println(obj);
		}
	}
	System.out.println("the character objects are");
	for(int i=0;i<a1.size();i++) {
		Object obj=a1.get(i);
		if (obj instanceof Character) {
			System.out.println(obj);
		}
	}
	System.out.println("The duplicate objects are:");
	for(int i=0;i<a1.size();i++) {
		for(int j=i+1;j<a1.size();j++) {
			Object obj=a1.get(i);
			Object obj1=a1.get(j);
			if(obj==obj1) {
				System.out.println(obj);
			}
			
		}
	}
	
}
}
