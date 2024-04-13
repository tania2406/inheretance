package inh;

class b3
{
	void call()
	{
		System.out.println("from b3");
	}
}
class c3 extends b3
{
void call()
	{
		System.out.println("from c3");
		//System.out.println(super.call());
	}
}

public class inh4 {
	public static void main(String args[])
	{
		b3 b=new c3();
		b.call();
		
	}

}
