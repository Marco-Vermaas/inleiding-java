package h11;

import java.applet.Applet;
import java.awt.*;

public class H11Opdracht3 extends Applet {

    int teller;
    int x = 0;
    int getal1 = 0;
    int getal2 = 1;
    int som = getal1 + getal2;

    public void paint(Graphics g) {

        for(teller = 0; teller < 7; teller++) {
            x += 25;
            g.drawString("" + som, x, 50);
            getal1 = getal2;
            getal2 = som;
            som = getal1 + getal2;
            teller++;
        }
    }
}
