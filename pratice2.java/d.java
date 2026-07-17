class B2 {
    void fun() {
        System.out.print("Hello java");
    }
}
class B extends B2 {
    void fun() {
        super.fun();
        System.out.print("Welcome java");
    }
}

class Demo {
    public static void main(String arg[]) {
        B ob = new B();
        ob.fun();
    }
}