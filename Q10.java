// 10) Write an applet to set a background color of an applet by passing parameters.
import java.applet.*;
import java.awt.*;

public class Q10 extends Applet {
    private Color backgroundColor;

    public void init() {
        // Get background color parameter from HTML
        String bgColorParam = getParameter("backgroundColor");
        if (bgColorParam != null) {
            try {
                // Parse color value from parameter
                backgroundColor = Color.decode(bgColorParam);
            } catch (NumberFormatException e) {
                System.err.println("Invalid color format: " + bgColorParam);
            }
        } else {
            System.err.println("Parameter 'backgroundColor' not found.");
        }
    }

    public void paint(Graphics g) {
        // Set the background color
        setBackground(backgroundColor);
        // Redraw the applet to update the background color
        super.paint(g);
    }
}

//<html>
//<head>
//<title>Background Color Applet</title>
//</head>
//<body>
//<applet code="BackgroundColorApplet.class" width="400" height="300">
//<param name="backgroundColor" value="#FF0000"> <!-- Change the value as needed -->
//</applet>
//</body>
//</html>

