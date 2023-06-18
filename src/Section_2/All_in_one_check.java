package Section_2;

public class All_in_one_check {
public All_in_one_check(){
	System.out.println("1");
}
static {
	System.out.println("2");
}
{
	System.out.println("3");
}
public static void main(String[] args) {
	System.out.println("5");
	All_in_one_check a1=new All_in_one_check();
	System.out.println("4");
}
}
