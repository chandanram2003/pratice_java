// interface A11
// {
// void fun();
// abstract public int meth(int);
// }
// interface B
// {
// void meth();}
// interface A11
// {
// void fun();
// }
// class B.implements A11.B
// {
// public void fun()
// {
// System.out.print("interface A11");
// }
// public void meth();
// {
// System.out.print("interface A11");
// }
// class DemoInterface
// {
// public Static void main(String arg[])
// {
// B ob=new B();
// ob.fun();
// ob.meth();
// }
// }

interface A11 {
    void fun();

    int meth(int x); // abstract by default
}

interface B {
    void meth();
}

class C implements A11, B {
    public void fun() {
        System.out.println("fun() from interface A11");
    }

    public int meth(int x) {
        System.out.println("meth(int) from interface A11, value = " + x);
        return x * 2;
    }

    public void meth() {
        System.out.println("meth() from interface B");
    }
}

class DemoInterface {
    public static void main(String[] args) {
        C ob = new C();
        ob.fun(); // from A11
        ob.meth(); // from B
        int result = ob.meth(10); // from A11
        System.out.println("Result = " + result);
    }
}
