package Section_2;
class Child1 extends ConstructorChaining
{
	public Child1(int num)
	{	
		super();
		if (num % 2 == 0)
		{
			System.out.println("Number is Even : " + num);
		}
		else
		{
			System.out.println("Number is Odd : " + num);
		}
	}
}

