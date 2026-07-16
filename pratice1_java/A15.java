class A15
{
void fun()
{
System.out.print("  Hello  ");
}
}
class B
{
void meth()
{
System.out.print("java");
}
}
class Demo
{ 
public static void main(String arg[])
{
A15 ob=new A15();
ob.fun();
B ob1=new B();
ob1.meth();
}
}