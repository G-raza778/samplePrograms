package Section_3;
//hashcode generating unique integer value.
public class Prgm3 {
public static void main(String[] args) {
	Prgm3 a1=new Prgm3();
	System.out.println(a1.hashCode());
	Prgm3 a2=new Prgm3();
	System.out.println(a2.hashCode());
	System.out.println(a1);
	Prgm3 a3=a2;
	System.out.println(a3);
	System.out.println(a3.hashCode());
}
}
