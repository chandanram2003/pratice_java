class A13
{
int a=5,fact=1;
void fun()
{
for(int i=1;i<=a;i++)
{
fact=fact*i;
System.out.print("fact="+fact);
}
}
}
class fact
{
public static void main(String arg[])
{
A13 ob=new A13();
ob.fun();
}
}