package Section_3;
//over riding of the object class method.
public class Prgm4 {
public static void main(String[] args) {
	Prgm4 a1=new Prgm4();
	Prgm4 a2=new Prgm4();
	System.out.println(a1.hashCode());
	System.out.println(a1.toString());
	System.out.println(a1.equals(a2));
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return 12233445;
}

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "jaddu ki jhappi";
}

}
