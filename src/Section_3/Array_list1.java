package Section_3;

import java.util.ArrayList;

public class Array_list1 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(12);
	a1.add(11);
	a1.add(123);
	a1.add(32);
	
	System.out.println("the enteger objects are:");
	for(int i=0;i<a1.size();i++) {
		Object obj=a1.get(i);
		if(obj instanceof Integer) {
			System.out.println(obj);
		}
	}
}
}
