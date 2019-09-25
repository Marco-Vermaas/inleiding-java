package h11;

import java.applet.Applet;
import java.awt.*;

public class H11Opdracht6 extends Applet {

    int teller;
    int y = 100;
    int x = 100;
    int width = 5;
    int height = 5;

    public void paint(Graphics g) {
    for(teller = 0; teller < 5; teller++) {
        height += 15;
        width += 15;
        g.drawOval(x, y, width, height);
        y +=- 7;
        x +=- 7;
    }
    }
}
