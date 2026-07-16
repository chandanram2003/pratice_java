class A18 {
    A18() {
        System.out.print("java ");
    }

    A18(int x) {
        System.out.print("super ");
    }

    A18(int x, int y) {
        System.out.print(x + " " + y + " ");
    }
}

class B extends A18 {
    B() {
        super();
        System.out.print("Welcome ");
    }

    B(int x, int y) {
        super(2, 3);
        System.out.print(x + " " + y + " ");
    }
}

class Demo {
    public static void main(String arg[]) {
        A18 ob= new A18();
    }
}