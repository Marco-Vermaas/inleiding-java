package h02;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class H2Opdracht2 extends Applet {

    public void init() {
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Marco", 75, 35);
        g.setColor(Color.RED);
        g.drawString("Vermaas", 75, 45);
    }
}