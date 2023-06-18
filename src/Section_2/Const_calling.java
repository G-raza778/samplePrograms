package Section_2;

public class Const_calling {
public Const_calling() {
	this(10);
	System.out.println("non parameterised constructor");
}
public Const_calling(int a) {
	this("String");
	System.out.println("integer type constructor");
}
public Const_calling(String s) {
	System.out.println("String type constructor");
}
public static void main(String[] args) {
	Const_calling a1=new Const_calling();
	System.out.println("in main method");
}
}
