package h02;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {
        setBackground(Color.BLUE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.drawString("Marco", 75, 35);
        g.setColor(Color.RED);
        g.drawString("Vermaas", 75, 50);
    }
}