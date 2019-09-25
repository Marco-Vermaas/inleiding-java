package h04;

import javax.swing.*;
import java.awt.*;

public class H4Opdracht6 extends JApplet {

    public void paint(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(20, 20, 230, 400);
        g.setColor(Color.RED);
        g.fillArc(50, 50, 170, 100, 0, 360);
        g.setColor(Color.ORANGE);
        g.fillArc(50, 175, 170, 100, 0, 360);
        g.setColor(Color.GREEN);
        g.fillArc(50, 300, 170, 100, 0, 360);
    }
}
