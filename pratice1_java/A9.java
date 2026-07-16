class A9
{
A9()
{
System.out.println("Hello");
}
A9(int x)
{
this();
System.out.println(x);
}
A9(int x,int y)
{
this(15);
System.out.println("x="+x+"y="+y);
}
void fun()
{
System.out.println("Welcome");
}
void meth()
{
this.fun();
System.out.println("Bye");
}
public static void main(String arg[])
{
A9 ob=new A9(10,20);
ob.meth();
}
}
