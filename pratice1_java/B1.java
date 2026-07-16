class B1
{
B1()
{
System .out.println("HELLO");
}
B1(int a ,int b)
{
this();
System.out.print(a+" "+b);
}
void fun()
{
System.out.print("java");
}
}
class This
{
public static void main(String args[])
{
B1 ob=new B1(20, 30);
ob.fun();
}
}