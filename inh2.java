package inh;

// Function Overloading:

class c1
{
	int call()
	{
		System.out.println("from class c1");
		return 100;
	}
}
class a2 extends c1
{
	int call()
	{
		System.out.println("from class a1");
        //System.out.println(super.call());
        
		return 1990;	
	}
}
public class inh2 {

	public static void main(String args[])
	{
		a2 b=new a2();
		System.out.println(b.call());
		
	}
}
