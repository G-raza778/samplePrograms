package Section_3;
//String immutibilty.
public class String_immut {
public static void main(String[] args) {
	String s="gulam";
	s.concat("raza");
	System.out.println(s);
	System.out.println(s.concat("raza"));
	System.out.println("==================");
	String s1=s.concat("raza");
	System.out.println(s1);
	System.out.println(s);
	System.out.println("====================");
	s=s.concat("raza");
	System.out.println(s);
	
}
}
