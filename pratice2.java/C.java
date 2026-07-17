class C {
    int a, b, sum;

    C() {
        a = 10;
        b = 20;
        sum = a + b;
    }

    void fun() {

    }

    void meth() {
        System.out.print("sum=" + sum);
    }
}

class SumDemo {
    public static void main(String arg[]) {
        C ob = new C();
        ob.fun();
        ob.meth();
    }
}