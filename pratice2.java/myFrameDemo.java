import java.awt.*;
import java.awt.event.*;
public class myFrameDemo extends Frame implements ActionListener
{
		Button b;
		Label l1;
		myFrameDemo()
		{
			b=new Button("Click");
			l1=new Label("a");
			setLayout(null);
			b.setBounds(100,150,60,40);
			l1.setBounds(200,150,150,40);
			add(b);add(l1);
			setSize(500,500);
			setVisible(true);
			b.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ob)
		{
			l1.setText("welcome to awt programing");
		}

			public static void main(String arg[])
			{
					new myFrameDemo();
		}
}