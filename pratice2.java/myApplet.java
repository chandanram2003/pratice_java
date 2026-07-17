import java.awt.*;
import java.applet.*;

/*
<applet code="myApplet" width="500" height="500">
</applet>
*/

public class myApplet extends Applet {

    public void init() {
        // initialization
    }

    public void start() {
        // applet start
    }

    public void paint(Graphics g) {
        g.drawLine(100, 200, 200, 300);   // line
        g.setColor(Color.yellow);        // color set
        g.fillRect(400, 300, 100, 70);   // filled rectangle
    }

    public void stop() {
        // applet stop
    }

    public void destroy() {
        // cleanup
    }
}