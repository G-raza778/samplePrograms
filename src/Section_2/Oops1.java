package Section_2;

public class Oops1 {
	//inheritance

	class Two extends One {

	@Override

	public void display() {

	System.out.println("Two");

	}

	public int add(int x, int y) {

	return x+y;

	}

	//Overload

	public double add(double x,double y) {

	return x+y;

	}

	}
}
