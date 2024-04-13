package inh;

// Single inheritance:
class b1
{
	int x=900;
	void call()
	{
		System.out.println("x is "+x);
	}
	void caller()
	{
		System.out.println("from caller of super");
	}
}
//class a1 extends b1
//{
//	int x=99;
//	void demo()
//	{
//		System.out.println("x in a1 "+x);
//	}
//}
//public class inh1 
//{
//	public static void main(String args[])
//	{
//		a1 b=new a1();
//		System.out.println(b.x);
//		b.call();
//		b.demo();
//	}
//
//}

// function overriding:

class a1 extends b1
{
	int x=99;
	void call()
	{
		System.out.println("x in a1 "+x);
		System.out.println("this x is in a1 "+this.x); // this is derived object of current class
		System.out.println("super x is in a1 "+super.x);// super is the derived object of suer class.
		super.call();// it can never be written in super class 
		caller();
	}
}
public class inh1 
{
	public static void main(String args[])
	{
		a1 b=new a1();
		System.out.println(b.x);
		b.call();
		// b.caller();
	}

}
