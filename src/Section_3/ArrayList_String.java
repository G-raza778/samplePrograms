package Section_3;
import java.util.ArrayList;
public class ArrayList_String {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("asad");
	a1.add("saad");
	a1.add('s');
	a1.add(1);
	a1.add('@');
	
	System.out.println("the String objects are");
	for(int i=0;i<a1.size();i++) {
		Object obj=a1.get(i);
		if (obj instanceof String) {
			System.out.println(obj);
		}
	}
	
}
}
