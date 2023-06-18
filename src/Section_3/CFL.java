package Section_3;
import java.util.ArrayList;
public class CFL {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(20);
	a1.add(10.2);
	a1.add("String");
	a1.add('r');
	a1.add('#');
	System.out.println(a1);
	
	ArrayList a2=new ArrayList();
	a2.add(21);
	a2.add(1.02);
	a2.add("qwerrty");
	a2.add('s');
	System.out.println(a2);
	
	a1.remove("String");
	//System.out.println(a1.remove(20));
	System.out.println("after removal string from a1 is"+a1);
	System.out.println("does a1 contains 20 "+a1.contains(20));
	a1.addAll(a2);
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a1.containsAll(a2));
	
}
}
