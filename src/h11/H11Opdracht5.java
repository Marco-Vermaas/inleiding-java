package h11;

import java.applet.Applet;
import java.awt.*;

public class H11Opdracht5 extends Applet {

    int teller;
    int y = 20;
    int x = 20;

    public void paint(Graphics g) {
        for (teller = 0; teller < 5; teller++) {
            y += 20;
            x += 20;
            g.drawRect(x, y, 20, 20);
        }
    }
}
