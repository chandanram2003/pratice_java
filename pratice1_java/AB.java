class AB
{
int a=10;
 void fun()
{
System.out.print("a="+a);
}
}
class B extends AB
{
int x;
public void meth()
{
System.out.print(" sub class");
}
}
class Demo
{
public static void main(String arg[])
{
B ob=new B();
ob.fun();
ob.meth();
}
}