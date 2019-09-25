package h02;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class H2Opdracht1 extends Applet {

    public void init() {
        setBackground(Color.BLUE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.drawString("Marco Vermaas", 75, 35);
    }
}