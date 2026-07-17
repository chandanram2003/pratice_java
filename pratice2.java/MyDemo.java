import java.awt.*;

public class MyDemo extends Frame {

	Button b;
	Label l;

	MyDemo() {
		b = new Button("Click");
		l = new Label("Welcome");

		setLayout(new FlowLayout()); 
		add(b);
		add(l);

		setSize(400, 500);
		setVisible(true);
	}

	public static void main(String arg[]) {
		new MyDemo();
	}
}