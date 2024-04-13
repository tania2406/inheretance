package inh;

// Final keyword:

final class b1k // final keyword with class restrict inheritance.
{
	final void call() // final keyword with func. restrict func. overriding
	{
		System.out.println("from call in b1");
		}
	
}
class c1k// extends b1k
{
	void call(int x)
	{
		System.out.println("from c1");
	}
}
public class fin
{
	public static void main(String args[])
	{
		final int x=90; // final keyword with variable restrict reassignment of value int the variable
		System.out.println("x is "+x);
		System.out.println(" x is "+x*9);
		
		c1k c=new c1k();
		c.call(90);
	}
}