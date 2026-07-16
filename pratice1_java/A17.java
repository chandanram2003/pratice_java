class A17
{
void fun(int x,int y)
{
int z=x+y;
System.out.println(z);
}
}
class B extends A17
{
void meth()
{
System.out.println("Hii");
}
}
class Demo
{
public static void main(String arg[])
{
B ob=new B();
ob.meth();
ob.fun(5,15);
}
}