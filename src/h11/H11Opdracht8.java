package h11;

import java.applet.Applet;
import java.awt.*;

public class H11Opdracht8 extends Applet {

    public void paint(Graphics g) {
        int teller;
        int y = 750;
        int x = 900;
        int width = 50;
        int height = 50;
        for(teller = 0; teller < 100; teller++) {
            height+=14;
            width+=14;
            g.drawOval(x,y,width,height);
            y+=-7;
            x+=-7;
        }

    }

}