package h04;

import javax.swing.*;
import java.awt.*;

public class H4Praktijkopdracht extends JApplet {

public void paint(Graphics g) {
    g.drawLine(20, 20, 120, 20);
    g.drawRect(20, 50, 120, 60);
    g.drawRoundRect(20, 140, 120, 60, 30, 30);
    g.setColor(Color.MAGENTA);
    g.fillRect(170, 50, 120, 60);
    g.fillArc(170, 140, 120, 60, 0, 360);
    g.fillArc(320, 50, 120, 60, 0, 45);
    g.setColor(Color.BLACK);
    g.drawArc(170, 50, 120, 59, 0, 360);
    g.drawArc(320, 50, 120, 60, 0, 360);
    g.drawOval(350, 140, 60, 60);
}
}
