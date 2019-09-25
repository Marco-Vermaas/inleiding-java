package h11;

import java.applet.Applet;
import java.awt.*;

public class H11Opdracht4 extends Applet {

    int teller;
    int y = 20;

    public void paint(Graphics g) {
        for(teller = 3; teller <31; teller++, teller++, teller++) {
            y += 25;
            g.drawString("" + teller, 25, y);


        }
    }
}
