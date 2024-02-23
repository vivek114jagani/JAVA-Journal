// 11) Write an Applet to draw smiley.

import java.applet.*;
import java.awt.*;

public class Q11 extends Applet {
    public void paint(Graphics g) {
        // Draw face
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 200, 200);

        // Draw eyes
        g.setColor(Color.black);
        g.fillOval(100, 100, 40, 40);
        g.fillOval(190, 100, 40, 40);

        // Draw mouth (smile)
        g.setColor(Color.black);
        g.drawArc(100, 120, 130, 100, 180, 180);
    }
}

//<html>
//<head>
//<title>Smiley Applet</title>
//</head>
//<body>
//<applet code="SmileyApplet.class" width="300" height="300">
//</applet>
//</body>
//</html>

