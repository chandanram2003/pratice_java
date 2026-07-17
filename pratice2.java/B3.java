class B3 {
    int a;

    B3() {
        System.out.print("default ");
    }

    B3(int x) {
        a = x;
        System.out.print("a=" + a + " ");
    }
}

class B4 extends B3 {
    B4() {
        super(10);
        System.out.print("india ");
    }

    B4(int x) {
        super(20);
        System.out.print("x=" + x + " ");
    }
}

class demo {
    public static void main(String arg[]) {
        B3 ob = new B3();
        B3 ob1 = new B3(10);
    }
}