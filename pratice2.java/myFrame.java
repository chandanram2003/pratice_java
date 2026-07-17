import java.awt.*;

public class myFrame extends Frame {
	Button b;
	Label l;

	myFrame() {
		b = new Button("click");
		l = new Label("hii");
		add(b);
		add(l);
		setLayout(new FlowLayout());
		setSize(400, 500);
		setVisible(true);
	}

	public static void main(String arg[]) {
		new myFrame();
	}
}