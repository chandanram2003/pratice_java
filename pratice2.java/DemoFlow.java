import java.awt.*;

public class DemoFlow extends Frame
{
	Button b1,b2,b3,b4;
	DemoFlow()
	{
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		
		setLayout(new FlowLayout(FlowLayout.RIGHT,20,20));
		add(b1);add(b2);add(b3);add(b4);
		
		setSize(500,500);
		setVisible(true);
	}
public static void main(String arg[])
	{
		new DemoFlow();
	}	
}
				