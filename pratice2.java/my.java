import java.awt.*;


public class my extends Frame
{
	Button b;
	Label l;
	my()
	{
		b=new Button("click");
		l=new Label("chandan");
		add(b);add(l);
		setLayout(new FlowLayout());
		setSize(400,500);
		setVisible(true);
	}
public static void main(String arg[])
		{
		new my();
		}
}