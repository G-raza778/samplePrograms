package Section_2;

public class Multi1 implements Multi, Multi_int
{
public void even() {
	int a=10;
	if (a%2==0) {
		System.out.println("its an even number");
	}
}
public void odd() {
	int a=10;
	if (a%2!=0) {
		System.out.println("it is a odd umber number");
	}
}
public static void main(String[] args) {
	Multi1 a1=new Multi1();
	a1.even();
	a1.odd();
}
}
