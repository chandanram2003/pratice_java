class ckb
{
int a=5,fact=1,i;
void fun()
{
for(i=1;i<=a;i++)
{
fact=fact*i;
}
System.out.print("fact="+fact);
}
}
class fact
{
public static void main(String arg[])
{
ckb ob=new ckb();
ob.fun();
}
}