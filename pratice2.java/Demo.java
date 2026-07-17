class Demo {
	int a = 10;
	String b = "chandan";

	void Show() {
		System.out.print(a + " " + b);
	}
}

class Test {

	public static void main(String[] args) {
		Demo ob = new Demo();
		ob.Show();
	}

}