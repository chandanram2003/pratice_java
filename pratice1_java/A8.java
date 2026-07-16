class A8
{
int a,b;
void fun(int x,int y)
{
this.a=x;
this.b=y;
System.out.println("a="+a+"b="+b);
}
public static void main(String arg[])
{
A8 ob=new A8();
A8 ob1=new A8();
A8 ob2=new A8();
ob.fun(10,20);
ob1.fun(30,40);
ob2.fun(50,60);
}
}

