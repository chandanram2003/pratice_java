class A
{
int a;
A(int x )
{
a=x;
System.out.print("a="+a);
}
}
class B extends A 
{
B()
{super(10);
System.out.print("Default constractor");
}
B(int x)
{super(20);
System.out.print("x="+x);
}
}
class Demosuper
{
public static void main(String arg[])
{
B ob=new B();
B ob1=new B(10);
}
}