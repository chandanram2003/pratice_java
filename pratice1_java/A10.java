abstract class A10
{
A10()
{
System.out.println("abstract class");
}
abstract void fun(int x);
void meth()
{
System.out.println("abstract class method");
}
}
class B extends A10
{
void fun(int x)
{
System.out.print(x);
}
}
class DemoAbstract
{
public static void main(String arg[])
{
B ob=new B();
ob.fun(10);
ob.meth();
}
}