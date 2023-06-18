package Section_3;

import java.util.ArrayList;

public class ArrayList_String11 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("i");
	a1.add("love");
	a1.add(010);
	a1.add(20);
	a1.add("you");
	
	System.out.println("the String objects are:");
	for(int i=0;i<a1.size();i++) {
		Object obj=a1.get(i);
		if(obj instanceof String) {
			System.out.print(obj+" ");
		}
	}
}
}
