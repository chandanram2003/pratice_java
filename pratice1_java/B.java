
class B {
	public static void main(String args[]) {
		System.out.println("welcome to java");

		B.fun();
		B ob = new B();
		ob.meth();
	}

	static void fun() {
		System.out.println("hello");
	}

	void meth() {
		System.out.println("bye");
	}
}
