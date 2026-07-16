class A16
{
      void fun(int n)
    {
       int i,t;
       for(i=1;i<=10;i++)
     {
        t=n*i;
        System.out.println(n+"*"+i+"= "+t);
     }
   }
 }
class demo
{
       public static void main(String arg[])
    {
        A16 ob=new A16 ();
        ob.fun(5);
    }
}