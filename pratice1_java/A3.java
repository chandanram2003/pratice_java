class A3 {
    public void fun() {
        System.out.println("Hello");
    }

    public int fun(int x) {
        System.out.println("x=" + x);
        return x + 5;
    }

    public void fun(int x, int y) {
        System.out.println("x=" + x + "y=" + y);
    }

    void display() {
        System.out.println("Bye");
    }
}

class Demooverload {
    public static void main(String arg[]) {
        A3 ob = new A3();
        ob.fun();
        int x = ob.fun(5);
        ob.fun(10, 5);
        ob.display();
    }
}