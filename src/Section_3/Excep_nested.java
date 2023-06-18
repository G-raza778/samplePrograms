package Section_3;
//nested try catch.
public class Excep_nested {
public static void main(String[] args) {
	try {
		System.out.println("outer try block");
	  try {
		System.out.println(10/0);
	       }
	    catch(Exception e)
	    {
		System.out.println("Iner block "+e.getMessage());
    	}
    	}
	catch(Exception e)
	{
		System.out.println("Outer block "+e.getMessage());
	}
}
}
