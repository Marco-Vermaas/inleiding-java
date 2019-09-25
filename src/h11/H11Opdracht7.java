package h11;

import java.applet.Applet;
import java.awt.*;

public class H11Opdracht7 extends Applet {

    public void paint(Graphics g) {
        int teller;
        int y = 450;
        int x = 600;
        int width = 50;
        int height = 50;
        for(teller = 0; teller < 50; teller++) {
            height+=14;
            width+=14;
            g.drawOval(x,y,width,height);
            y+=-7;
            x+=-7;
        }

    }

}