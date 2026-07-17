class myEx 
{
	void fun()
	{ System.out.println("hello");

		int x=10/0;
	}
	void meth()
	{
	fun();
	}
	void dis()
	{
	meth();
	}
public static void main(String arg[])
	{
		myEx ob=new myEx();
	try
			{
				ob.dis();
			}
catch(Exception e)
	{
		System.out.print(e);
		}
	}
}
