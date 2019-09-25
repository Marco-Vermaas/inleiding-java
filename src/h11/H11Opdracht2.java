package h11;

import java.applet.Applet;
import java.awt.*;

public class H11Opdracht2 extends Applet {

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller = 20; teller > 9; teller--) {
            x += 20;
            g.drawString("" + teller, x, 50);
        }
    }
}
