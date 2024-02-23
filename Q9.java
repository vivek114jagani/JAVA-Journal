// Q9) Write an applet that gets number of square from the user using PARAM tag and draw the square on diff position

import java.applet.Applet;
import java.awt.*;

public class Q9 extends Applet {
    private int numOfSquares;

    public void init() {
        // Get the number of squares from the PARAM tag
        String numOfSquaresStr = getParameter("numOfSquares");
        if (numOfSquaresStr != null) {
            try {
                numOfSquares = Integer.parseInt(numOfSquaresStr);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input for number of squares.");
            }
        } else {
            System.err.println("Parameter 'numOfSquares' not found.");
        }
    }

    public void paint(Graphics g) {
        if (numOfSquares > 0) {
            int width = getWidth();
            int height = getHeight();

            for (int i = 0; i < numOfSquares; i++) {
                // Generate random position for the square
                int x = (int) (Math.random() * (width - 50));
                int y = (int) (Math.random() * (height - 50));

                // Draw the square
                g.drawRect(x, y, 50, 50);
            }
        }
    }
}

//<html>
//<head>
//<title>Draw Squares Applet</title>
//</head>
//<body>
//<applet code="DrawSquares.class" width="400" height="400">
//<param name="numOfSquares" value="5"> <!-- Change the value as needed -->
//</applet>
//</body>
//</html>


