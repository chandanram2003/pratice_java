class A1
{
void fun(int x)
{
if(x%2==0)
{
System.out.print("Even no");
}
else
{
System.out.print("odd no");
}
}
}
class DemoEven
{
public static void main(String args[])
{
A1 ob=new A1();
ob.fun(122);
ob.fun(91);
}
}