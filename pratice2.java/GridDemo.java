import java.awt.*;

public class GridDemo extends Frame
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	
	GridDemo()
	{
		b1= new Button("1");
		b2= new Button("2");
		b3= new Button("3");
		b4= new Button("4");
		b5= new Button("5");
		b6= new Button("6");
		b7= new Button("7");
		b8= new Button("8");
		b9= new Button("9");
		b10= new Button("10");
		b11= new Button("11");
		b12= new Button("12");
		setLayout(new GridLayout(4,3));
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);
		add(b7);add(b8);add(b9);add(b10);add(b11);add(b12);
		setSize(500,500);
		setVisible(true);
	}
		public static void main(String arg[])
		{
			new GridDemo();
			new GridDemo();
		}
}
	