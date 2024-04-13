package inh;

abstract class ran
{
   abstract void demo();
	
  void show()
	{
		System.out.println("from show");
}
}
class p1k extends ran
{
	void demo()
	{
		System.out.println("from p1k");
		}
}
class p2k extends ran
{
	void demo()
	{
		System.out.println("from p2k");
	}
}
public class abs 
{
	public static void main(String args[])
	{
		ran r;
		p1k p=new p1k();
		p2k pp=new p2k();
		r=p;
		r.demo();
		r.show();
		r=pp;
		r.demo();
		r.show();
	}

}
